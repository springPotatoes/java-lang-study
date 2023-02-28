public class Ex8_13 {

    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException2 se) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(se);
            throw ie;
        } catch (MemoryException2 me) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException2, MemoryException2 {
        if (!enoughSpace()) {
            throw new SpaceException2("설치할 공간이 부족합니다.");
        }
        if (!enoughMemory()) {
            throw new MemoryException2("메모리가 부족합니다.");
        }
    }
    static void copyFiles() {
    }
    static void deleteTempFiles() {
    }
    static boolean enoughSpace() {
        return false;
    }
    static boolean enoughMemory() {
        return true;
    }

    static class InstallException extends Exception {
        InstallException(String msg) {
            super(msg);
        }
    }
    static class SpaceException2 extends Exception {
        SpaceException2(String msg) {
            super(msg);
        }
    }
    static class MemoryException2 extends Exception {
        MemoryException2(String msg) {
            super(msg);
        }
    }

}