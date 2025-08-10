package logprocessor;

import java.io.IOException;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Reducer;

public class LogReducer extends Reducer<Text, LongWritable, Text, LongWritable> {
    public void reduce(Text key, Iterable<LongWritable> values, Context context)
            throws IOException, InterruptedException {
        long total = 0;
        for (LongWritable val : values) {
            total += val.get();
        }
        context.write(key, new LongWritable(total / (1000 * 60))); // output in minutes
    }
}