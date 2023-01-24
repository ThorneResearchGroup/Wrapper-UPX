package tech.tresearchgroup.upx.controller;

import tech.tresearchgroup.upx.model.UPXOptions;

import java.util.ArrayList;
import java.util.List;

public class UPXController {
    public static List<String> getOptions(UPXOptions upxOptions) {
        List<String> optionsList = new ArrayList<>();
        if(upxOptions.isOne()) {
            optionsList.add("-1");
        }
        if(upxOptions.isTwo()) {
            optionsList.add("-2");
        }
        if(upxOptions.isThree()) {
            optionsList.add("-3");
        }
        if(upxOptions.isFour()) {
            optionsList.add("-4");
        }
        if(upxOptions.isFive()) {
            optionsList.add("-5");
        }
        if(upxOptions.isSix()) {
            optionsList.add("-6");
        }
        if(upxOptions.isSeven()) {
            optionsList.add("-7");
        }
        if(upxOptions.isEight()) {
            optionsList.add("-8");
        }
        if(upxOptions.isNine()) {
            optionsList.add("-9");
        }
        if(upxOptions.isBest()) {
            optionsList.add("-best");
        }
        if(upxOptions.isD()) {
            optionsList.add("-d");
        }
        if(upxOptions.isT()) {
            optionsList.add("-t");
        }
        if(upxOptions.isH()) {
            optionsList.add("-h");
        }
        if(upxOptions.isL()) {
            optionsList.add("-l");
        }
        if(upxOptions.isVersion()) {
            optionsList.add("-V");
        }
        if(upxOptions.isLicense()) {
            optionsList.add("-L");
        }
        if(upxOptions.isQ()) {
            optionsList.add("-q");
        }
        if(upxOptions.isV()) {
            optionsList.add("-v");
        }
        if(upxOptions.getO() != null) {
            optionsList.add("-o");
            optionsList.add(upxOptions.getO());
        }
        if(upxOptions.isF()) {
            optionsList.add("-f");
        }
        if(upxOptions.isNoColor()) {
            optionsList.add("--no-color");
        }
        if(upxOptions.isMono()) {
            optionsList.add("--mono");
        }
        if(upxOptions.isNoProgress()) {
            optionsList.add("--no-progress");
        }
        if(upxOptions.isBrute()) {
            optionsList.add("--brute");
        }
        if(upxOptions.isUltraBrute()) {
            optionsList.add("--ultra-brute");
        }
        if(upxOptions.isBackup()) {
            optionsList.add("--backup");
        }
        if(upxOptions.isNoBackup()) {
            optionsList.add("--no-backup");
        }
        if(upxOptions.getOverlay() != null) {
            optionsList.add("--overlay");
        }
        if(upxOptions.getCoff() != null) {
            optionsList.add("--coff");
        }
        if(upxOptions.isEightyEightySix()) {
            optionsList.add("--8086");
        }
        if(upxOptions.isNoReloc()) {
            optionsList.add("--no-reloc");
        }
        if(upxOptions.isEightBit()) {
            optionsList.add("--8-bit");
        }
        if(upxOptions.isEightMibRam()) {
            optionsList.add("--8mib-ram");
        }
        if(upxOptions.isBootOnly()) {
            optionsList.add("--boot-only");
        }
        if(upxOptions.isNoAlign()) {
            optionsList.add("--no-align");
        }
        if(upxOptions.isLe()) {
            optionsList.add("--le");
        }
        if(upxOptions.getCompressExports() != null) {
            optionsList.add("--compress-exports");
            optionsList.add(upxOptions.getCompressExports());
        }
        if(upxOptions.getCompressIcons() != null) {
            optionsList.add("--compress-icons");
            optionsList.add(upxOptions.getCompressIcons());
        }
        if(upxOptions.getCompressResources() != null) {
            optionsList.add("--compress-resources");
            optionsList.add(upxOptions.getCompressResources());
        }
        if(upxOptions.getKeepResource() != null) {
            optionsList.add("--keep-resource");
            optionsList.add(upxOptions.getKeepResource());
        }
        if(upxOptions.getStripRelocs() != null) {
            optionsList.add("--strip-relocs");
            optionsList.add(upxOptions.getStripRelocs());
        }
        if(upxOptions.isPreserveBuildId()) {
            optionsList.add("--preserve-build-id");
        }
        return optionsList;
    }
}
