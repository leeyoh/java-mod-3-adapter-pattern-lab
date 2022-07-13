public class DigitalCameraAdapter implements CameraAdapter{
    private Camera traditionalCamera;

    public DigitalCameraAdapter(Camera camera) {
        this.traditionalCamera = camera;
    }
    public void takePhotograph(double shutterSpeed) {
        // implement a subset of the takePhotograph()
        // functionality from the Camera class here
        Logger.getInstance().log(traditionalCamera.getName() + " is taking a DIGITAL photograph");
        traditionalCamera.getMirrorOps().openMirror();;
        traditionalCamera.getShutterOps().setShutterSpeedSetting(shutterSpeed);
        traditionalCamera.getShutterOps().initializeShutter();
        traditionalCamera.getShutterOps().activateShutter();
        traditionalCamera.getShutterOps().releaseShutter();
        traditionalCamera.getMirrorOps().closeMirror();
        Logger.getInstance().log(traditionalCamera.getName() + " is done taking this DIGITAL photograph");
    }

}