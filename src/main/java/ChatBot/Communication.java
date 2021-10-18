package ChatBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Communication extends SpringBootServletInitializer {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Communication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder){
        return builder.sources(this.getClass());
    }
}

// import org.neo4j.graphdb.GraphDatabaseService;
// import org.neo4j.graphdb.factory.GraphDatabaseFactory;
// import java.io.File;
// import java.util.*;
// import java.nio.file.Paths;
// import java.nio.file.Files;

// public class Communication {
    
//     private static GraphDatabaseFactory dbFactory = new GraphDatabaseFactory();
//     private static GraphDatabaseService db;
//     static {
//         try {
//             // File graphdb = new File(Comm.class.getResource("../graph.db"));
//             // String filePath = Objects.requireNonNull(getClass().getClassLoader().getResource("../graph.db")).getPath();
//             // File graphdb = new File(filePath);



//             // if (graphdb.exists() && !graphdb.isDirectory()) {
//             //     System.out.print("graphdb exists");
//             // } else {
//             //     System.out.print("graphdb not exists");
//             // }
//             // db = dbFactory.newEmbeddedDatabase(graphdb.toURI());

//             // List<String> lines = Files.readAllLines(Paths.get(Communication.class.getResource("../graph.db").toURI()));
//             System.out.print(Communication.class.getResource("../graph.db"));
//             db = dbFactory.newEmbeddedDatabase(new File(Communication.class.getResource("../graph.db").toExternalForm()));
//         } catch (Exception e) {
//            e.printStackTrace();
//             db = dbFactory.newEmbeddedDatabase(new File("src/res/graph.db"));
//         }
//     }
//     public static final void main(String[] args) {
//         System.out.print("hello");
//     }
// }