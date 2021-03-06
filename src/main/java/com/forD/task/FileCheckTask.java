package com.forD.task;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import com.forD.domain.BoardAttachVO;
import com.forD.mapper.BoardAttachMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class FileCheckTask {
	@Setter(onMethod_= {@Autowired})
	private BoardAttachMapper attachMapper;
	
	private String getFolderYesterDay() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		String str=sdf.format(cal.getTime());
		return str.replace("-", File.separator);
	}
	
	@Scheduled(cron="0 0 2 * * *") //cron="seconds(0~59) minutes(0~59) hours(0~23) day(1~31) months(1~12) dayOfWeek(1~7) year(optional)"
	public void checkFiles() throws Exception{
		//file list in database
		List<BoardAttachVO> fileList=attachMapper.getOldFiles();
		
		//ready for check file in directory with database file list
		List<Path> fileListPaths=fileList.stream().map(vo->Paths.get("C:\\YKProject\\forD\\upload", vo.getUploadPath(),vo.getUuid()+"_"+vo.getFileName())).collect(Collectors.toList());
		
		//image file has thumbnail file
		fileList.stream().filter(vo->vo.isFileType()==true).map(vo->Paths.get("C:\\YKProject\\forD\\upload",vo.getUploadPath(),"s_"+vo.getUuid()+"_"+vo.getFileName())).forEach(p-> fileListPaths.add(p));
		
		
		fileListPaths.forEach(p->log.warn(p));
		
		//files in yesterday directory
		File targetDir = Paths.get("C:\\YKProject\\forD\\upload",getFolderYesterDay()).toFile();
		
		File[] removeFiles=targetDir.listFiles(file->fileListPaths.contains(file.toPath())==false);
		
		
		for(File file:removeFiles) {
			file.delete();
		}
	}

}
