package com.example.demo;

import java.text.SimpleDateFormat;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.embedder.EmbedderControls;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.ParameterConverters;
import org.jbehave.core.steps.SilentStepMonitor;

import com.thoughtworks.xstream.converters.basic.DateConverter;

public class EmbedderBase extends Embedder{
	@Override
    public EmbedderControls embedderControls() {
        return new EmbedderControls().doIgnoreFailureInStories(true).doIgnoreFailureInView(true);
    }
  
    @Override
    public  Configuration configuration() {
        Class<? extends EmbedderBase> embedderClass = this.getClass();
      //MostUsefulConfiguration使用默认的配
        return new MostUsefulConfiguration()
            //设置story文件的加载路
            .useStoryLoader(new LoadFromClasspath(embedderClass.getClassLoader()))
            //设定生成报告的相关配
            .useStoryReporterBuilder(new StoryReporterBuilder()
                .withCodeLocation(CodeLocations.codeLocationFromClass(embedderClass))
                .withFormats(Format.CONSOLE, Format.TXT)
                .withCrossReference(new CrossReference()))
             //设定相关参数的转
            .useStepMonitor(new SilentStepMonitor());                             
    }
}
