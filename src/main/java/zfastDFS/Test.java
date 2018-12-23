package zfastDFS;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

public class Test {
	public static void main(String[] args) {
		
		try {
			ClientGlobal.init("D:\\A_pinyougou_project\\fdfs_client.conf");
			TrackerClient trackerClient=new TrackerClient();
			TrackerServer trackerServer=trackerClient.getConnection();
			StorageServer storageServer=null;
			StorageClient storageClient=new StorageClient(trackerServer, storageServer);
			
			String [] strings=storageClient.upload_file("D:\\A_pinyougou_project\\z.jpg","jpg",null);
			for (String string : strings) {
				System.out.println(string);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
