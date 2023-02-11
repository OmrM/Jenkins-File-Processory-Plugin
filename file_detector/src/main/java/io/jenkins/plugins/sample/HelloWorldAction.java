/*HelloWorld Action  */

package io.jenkins.plugins.sample;
import hudson.model.Action;

public class HelloWorldAction implements Action {
    //With these changes, the action will show in the build’s side panel, and link to the URL \http://JENKINS/job/JOBNAME/BUILDNUMBER/greeting/.
    //the page at this url needs to be defined with apache commons Jelly
    @Override
    public String getIconFileName() {
        //This is the icon used for the side panel item. document.png is one of the predefined icons bundled with Jenkins.
        return "document.png";
    }

    @Override
    public String getDisplayName() {
        //This is the label used for the side panel item.
        return "Greeting";
    }

    @Override
    public String getUrlName() {
        //This is the URL fragment used for this action.
        return "greeting";
    }


    //getters and setters for this class:
    private String name;

    public HelloWorldAction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }




}