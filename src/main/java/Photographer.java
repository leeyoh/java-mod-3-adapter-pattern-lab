public class Photographer {
    Camera cam;
    DigitalCameraAdapter digitalCam;
    public Photographer(){
        CameraFactory camF = new CameraFactory();
        cam = camF.makeCamera(CameraFactory.CameraManufacturer.NIKON_FILM);
        digitalCam = new DigitalCameraAdapter(cam);
    }
    public void takePhotograph(){
        cam.takePhotograph(10);
        digitalCam.takePhotograph(10);
    }
}
