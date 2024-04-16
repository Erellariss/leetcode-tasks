package leetcode.utils;

public class VersionControl {

    private int badVersion;

    public VersionControl(int badVersion) {
        this.badVersion = badVersion;
    }

    public boolean isBadVersion(int v) {
        System.out.println(v);
        return v >= badVersion;
    }
}
