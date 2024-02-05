package it.formazione.libreria;

import com.openkm.sdk4j.OKMWebservicesFactory;
import com.openkm.sdk4j.bean.Activity;
import com.openkm.sdk4j.bean.ActivityList;
import com.openkm.sdk4j.exception.DatabaseException;
import com.openkm.sdk4j.exception.RepositoryException;
import com.openkm.sdk4j.exception.WebserviceException;
import com.openkm.sdk4j.impl.OKMWebservices;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;

@SpringBootApplication
/**
 * MapperScan -> package contenente le interfaccie Mapper delle tabelle
 */
//@MapperScan(basePackages = { "it.formazione.libreria.mybatis.mapper" })
public class LibreriaApplication {

    public static void main(String[] args) {
        String host = "http://localhost:8080/openkm";
        String user = "okmAdmin";
        String password = "admin";
        OKMWebservices ws = OKMWebservicesFactory.getInstance(host);





        try {
            ws.login(user, password);
            System.out.println(ws.repository.getAppVersion());


            Calendar beginDate = Calendar.getInstance();
            Calendar endDate = Calendar.getInstance();
            beginDate.add(Calendar.MONTH, -1);
            String item = "f84a2e1f-a858-4e53-9c09-36519d903782";

            ActivityList results = ws.activity.findActivityLog(0, 20, beginDate, endDate, user, "", item);

            for(Activity activity: results.getActivities()) {
                System.out.println(activity);
            }



        } catch (RepositoryException | DatabaseException e) {
            e.printStackTrace();
        } catch (WebserviceException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
