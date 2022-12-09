/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.WorkQueue;

import Backend.Employee.Employee;
import Backend.Location.Location;


/**
 *
 * @author Mayank
 */
public class ReportingAdminSceneRequest extends WorkRequest {

    private String sceneName;
    private String sceneId;
    private String sceneZipcode;
    private Location sceneLocationPoint;
    private Employee sceneManager;
    private String imagePath;
    private String requirements;
    private boolean considerInGraph = true;
    int min = 100;
    int max = 999;
    
    public ReportingAdminSceneRequest() {
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
        sceneId = "SCENE"+randomNum;
    }
    
    public boolean isConsiderInGraph() {
        return considerInGraph;
    }

    public void setConsiderInGraph(boolean considerInGraph) {
        this.considerInGraph = considerInGraph;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    public String getSceneZipcode() {
        return sceneZipcode;
    }

    public void setSceneZipcode(String sceneZipcode) {
        this.sceneZipcode = sceneZipcode;
    }

    public Location getSceneLocationPoint() {
        return sceneLocationPoint;
    }

    public void setSceneLocationPoint(Location sceneLocationPoint) {
        this.sceneLocationPoint = sceneLocationPoint;
    }

    public Employee getSceneManager() {
        return sceneManager;
    }

    public void setSceneManager(Employee sceneManager) {
        this.sceneManager = sceneManager;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return sceneId;
    }

}
