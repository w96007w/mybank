package com.example.demo;
import static org.junit.Assert.*;
import java.util.List;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryFinder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
 

public class TcTest {
 @BeforeClass
 public static void setUpBeforeClass() throws Exception {
 }
 @AfterClass
 public static void tearDownAfterClass() throws Exception {
 }
 @Before
 public void setUp() throws Exception {
 }
 @After
 public void tearDown() throws Exception {
 }
  

 
 @Test
 public void runClasspathLoadedStoriesAsJUnit() {
   
     Embedder embedder = new TestStories();
     List<String> storyPaths = new StoryFinder().findPaths(CodeLocations.codeLocationFromClass(this.getClass()),"/testStroies.story",""); 
     embedder.runStoriesAsPaths(storyPaths);
     
	 
 }
   @Test
 public void runClasspathLoadedStories() {
    
     Embedder embedder = new loginYahoo();
     List<String> storyPaths = new StoryFinder().findPaths(CodeLocations.codeLocationFromClass(this.getClass()),"/loginYahoo.story",""); 
     embedder.runStoriesAsPaths(storyPaths);
 }
}