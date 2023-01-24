package tech.tresearchgroup.upx.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class UPXOptions {
    @CommandLine.Option(names = "-1", description = "Compression level 1")
    private boolean one;

    @CommandLine.Option(names = "-2", description = "Compression level 2")
    private boolean two;

    @CommandLine.Option(names = "-3", description = "Compression level 3")
    private boolean three;

    @CommandLine.Option(names = "-4", description = "Compression level 4")
    private boolean four;

    @CommandLine.Option(names = "-5", description = "Compression level 5")
    private boolean five;

    @CommandLine.Option(names = "-6", description = "Compression level 6")
    private boolean six;

    @CommandLine.Option(names = "-7", description = "Compression level 7")
    private boolean seven;

    @CommandLine.Option(names = "-8", description = "Compression level 8")
    private boolean eight;

    @CommandLine.Option(names = "-9", description = "Compression level 9")
    private boolean nine;

    @CommandLine.Option(names = "-best", description = "Compression level best")
    private boolean best;

    @CommandLine.Option(names = "-d", description = "Decompress")
    private boolean d;

    @CommandLine.Option(names = "-t", description = "Test compressed file")
    private boolean t;

    @CommandLine.Option(names = "-h", description = "Give this help")
    private boolean h;

    @CommandLine.Option(names = "-l", description = "List compressed file")
    private boolean l;

    @CommandLine.Option(names = "-V", description = "Display version number")
    private boolean version;

    @CommandLine.Option(names = "-L", description = "Display software license")
    private boolean license;

    @CommandLine.Option(names = "-q", description = "Be quiet")
    private boolean q;

    @CommandLine.Option(names = "-v", description = "Be verbose")
    private boolean v;

    @CommandLine.Option(names = "-o", description = "Write output to file")
    private String o;

    @CommandLine.Option(names = "-f", description = "Force compression of suspicious files")
    private boolean f;

    @CommandLine.Option(names = "--no-color")
    private boolean noColor;

    @CommandLine.Option(names = "--mono")
    private boolean mono;

    @CommandLine.Option(names = "--no-progress")
    private boolean noProgress;

    @CommandLine.Option(names = "--brute", description = "Try all available compression methods & filters [slow]")
    private boolean brute;

    @CommandLine.Option(names = "--ultra-brute", description = "Try even more compression variants [very slow]")
    private boolean ultraBrute;

    @CommandLine.Option(names = "--backup", description = "Keep backup files")
    private boolean backup;

    @CommandLine.Option(names = "--no-backup", description = "No backup files [default]")
    private boolean noBackup;

    @CommandLine.Option(names = "--overlay")
    private String overlay;

    @CommandLine.Option(names = "--coff", description = "Produce COFF output [default: EXE]")
    private String coff;

    @CommandLine.Option(names = "--8086", description = "Make compressed com work on any 8086")
    private boolean eightyEightySix;

    @CommandLine.Option(names = "--no-reloc", description = "Put no relocations in to the exe header")
    private boolean noReloc;

    @CommandLine.Option(names = "--8-bit", description = "Uses 8 bit size compression [default: 32 bit]")
    private boolean eightBit;

    @CommandLine.Option(names = "--8mib-ram", description = "8 megabyte memory limit [default: 2 MiB]")
    private boolean eightMibRam;

    @CommandLine.Option(names = "--boot-only", description = "Disables client/host transfer compatibility")
    private boolean bootOnly;

    @CommandLine.Option(names = "--no-align", description = "Don't align to 2048 bytes [enables: --console-run]")
    private boolean noAlign;

    @CommandLine.Option(names = "--le", description = "Produce LE output [default: EXE]")
    private boolean le;

    @CommandLine.Option(names = "--compress-exports")
    private String compressExports;

    @CommandLine.Option(names = "--compress-icons")
    private String compressIcons;

    @CommandLine.Option(names = "--compress-resources")
    private String compressResources;

    @CommandLine.Option(names = "--keep-resource", description = "Set the input format name")
    private String keepResource;

    @CommandLine.Option(names = "--strip-relocs")
    private String stripRelocs;

    @CommandLine.Option(names = "--preserve-build-id", description = "copy .gnu.note.build-id to compressed output")
    private boolean preserveBuildId;
}
