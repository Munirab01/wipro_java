package logprocessor;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;

public class LogMapper extends Mapper<LongWritable, Text, Text, LongWritable> {

    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        try {
            String[] parts = value.toString().split(",");
            String user = parts[0];
            String action = parts[1];
            String timestamp = parts[2];

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long time = sdf.parse(timestamp).getTime();

            if (action.equalsIgnoreCase("login")) {
                context.write(new Text(user), new LongWritable(-time));
            } else if (action.equalsIgnoreCase("logout")) {
                context.write(new Text(user), new LongWritable(time));
            }
        } catch (Exception e) {
            // Handle bad input
        }
    }
}

