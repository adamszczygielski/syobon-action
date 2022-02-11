import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.MemoryImageSource;
import java.awt.image.PixelGrabber;
import java.util.Random;

public class Main extends Applet implements Runnable, KeyListener {

    static Random ZZ = new Random();
    boolean gflag = true;
    int main = 100;
    int maintm = 0;
    int stagecolor = 0;
    int sta = 1;
    int stb = 1;
    int stc = 0;
    int fast = 0;
    int trap = 1;
    int tyuukan = 0;
    int ending = 0;
    int stagerr;
    int stagepoint;
    int over = 0;
    int stageonoff = 0;
    int maint;
    int color;
    Image[][] grap = new Image[161][8];
    Image[] mgrap = new Image[51];
    int mirror;
    AudioClip[] oto = new AudioClip[151];
    int t;
    int tt;
    int t1;
    int t2;
    int t3;
    int t4;
    int zxon;
    int zzxon;
    int key;
    double pai = 3.1415926535D;
    int smax = 31;
    int sx;
    int sco;
    int[] sa;
    int[] sb;
    int[] sc;
    int[] sd;
    int[] stype;
    int[] sgtype;
    int[] srsp;
    int[] sxtype;
    int[] sr;
    int mainmsgtype;
    int ma;
    int mb;
    int mnobia;
    int mnobib;
    int mhp;
    int mc;
    int md;
    int macttype;
    int atkon;
    int atktm;
    int mactsok;
    int msstar;
    int nokori;
    int mactp;
    int mact;
    int mtype;
    int mxtype;
    int mtm;
    int mzz;
    int mzimen;
    int mrzimen;
    int mkasok;
    int mmuki;
    int mmukitm;
    int mjumptm;
    int mkeytm;
    int mcleartm;
    int mmutekitm;
    int mmutekion;
    int mztm;
    int mztype;
    int[] actaon;
    int mmsgtm;
    int mmsgtype;
    int mascrollmax;
    int tmax;
    int tco;
    int[] ta;
    int[] tb;
    int[] tc;
    int[] td;
    int[] thp;
    int[] ttype;
    int[] titem;
    int[] txtype;
    int tmsgtm;
    int tmsgtype;
    int tmsgx;
    int tmsgy;
    int tmsgnobix;
    int tmsgnobiy;
    int tmsg;
    int emax;
    int eco;
    int[] ea;
    int[] eb;
    int[] enobia;
    int[] enobib;
    int[] ec;
    int[] ed;
    int[] ee;
    int[] ef;
    int[] etm;
    int[] egtype;
    int amax;
    int aco;
    int[] aa;
    int[] ab;
    int[] anobia;
    int[] anobib;
    int[] ac;
    int[] ad;
    int[] ae;
    int[] af;
    int[] aacta;
    int[] aactb;
    int[] azimentype;
    int[] axzimen;
    int[] atype;
    int[] axtype;
    int[] amuki;
    int[] ahp;
    int[] anotm;
    int[] anx;
    int[] any;
    int[] atm;
    int[] a2tm;
    int[] amsgtm;
    int[] amsgtype;
    int[] abrocktm;
    int bmax;
    int bco;
    int[] ba;
    int[] bb;
    int[] btm;
    int[] btype;
    int[] bxtype;
    int[] bz;
    int nmax;
    int nxxmax;
    int nco;
    int[] na;
    int[] nb;
    int[] nc;
    int[] nd;
    int[] ntype;
    int[] ne;
    int[] nf;
    int[] ng;
    int[] nx;
    int srmax;
    int srco;
    int[] sra;
    int[] srb;
    int[] src;
    int[] srd;
    int[] sre;
    int[] srf;
    int[] srtype;
    int[] srgtype;
    int[] sracttype;
    int[] srmuki;
    int[] sron;
    int[] sree;
    int[] srsok;
    int[] srmovep;
    int[] srmove;
    int fx;
    int fy;
    int fzx;
    int fzy;
    int scrollx;
    int scrolly;
    int fma;
    int fmb;
    int kscroll;
    int fxmax;
    int fymax;
    byte[][] stagedate;
    int blacktm;
    int blackx;
    int[] xx;
    double[] xd;
    String[] xs;
    long stime;
    Thread Z;
    Image buf;
    Graphics h;
    Color co;
    int keytm;
    int w;
    boolean key_Up;
    boolean key_Down;
    boolean key_Left;
    boolean key_Right;
    boolean key_Z;
    boolean key_X;
    boolean key_A;
    boolean key_Enter;
    boolean key_Space;
    boolean key_0;
    boolean key_1;
    boolean key_2;
    boolean key_3;
    boolean key_4;
    boolean key_O;
    boolean key_T;
    Image img;
    Image wkp;
    Graphics wkg;
    MediaTracker mt;
    byte[][] stagedatex;


    public Main() {
        sa = new int[smax];
        sb = new int[smax];
        sc = new int[smax];
        sd = new int[smax];
        stype = new int[smax];
        sgtype = new int[smax];
        srsp = new int[smax];
        sxtype = new int[smax];
        sr = new int[smax];
        nokori = 2;
        actaon = new int[7];
        mascrollmax = 21000;
        tmax = 641;
        ta = new int[tmax];
        tb = new int[tmax];
        tc = new int[tmax];
        td = new int[tmax];
        thp = new int[tmax];
        ttype = new int[tmax];
        titem = new int[tmax];
        txtype = new int[tmax];
        emax = 201;
        ea = new int[emax];
        eb = new int[emax];
        enobia = new int[emax];
        enobib = new int[emax];
        ec = new int[emax];
        ed = new int[emax];
        ee = new int[emax];
        ef = new int[emax];
        etm = new int[emax];
        egtype = new int[emax];
        amax = 24;
        aa = new int[amax];
        ab = new int[amax];
        anobia = new int[amax];
        anobib = new int[amax];
        ac = new int[amax];
        ad = new int[amax];
        ae = new int[amax];
        af = new int[amax];
        aacta = new int[amax];
        aactb = new int[amax];
        azimentype = new int[amax];
        axzimen = new int[amax];
        atype = new int[amax];
        axtype = new int[amax];
        amuki = new int[amax];
        ahp = new int[amax];
        anotm = new int[amax];
        anx = new int[160];
        any = new int[160];
        atm = new int[amax];
        a2tm = new int[amax];
        amsgtm = new int[amax];
        amsgtype = new int[amax];
        abrocktm = new int[amax];
        bmax = 81;
        ba = new int[bmax];
        bb = new int[bmax];
        btm = new int[bmax];
        btype = new int[bmax];
        bxtype = new int[bmax];
        bz = new int[bmax];
        nmax = 41;
        na = new int[nmax];
        nb = new int[nmax];
        nc = new int[nmax];
        nd = new int[nmax];
        ntype = new int[nmax];
        ne = new int[nmax];
        nf = new int[nmax];
        ng = new int[nmax];
        nx = new int[nmax];
        srmax = 21;
        sra = new int[srmax];
        srb = new int[srmax];
        src = new int[srmax];
        srd = new int[srmax];
        sre = new int[srmax];
        srf = new int[srmax];
        srtype = new int[srmax];
        srgtype = new int[srmax];
        sracttype = new int[srmax];
        srmuki = new int[srmax];
        sron = new int[srmax];
        sree = new int[srmax];
        srsok = new int[srmax];
        srmovep = new int[srmax];
        srmove = new int[srmax];
        fx = 0;
        fy = 0;
        fma = 0;
        fmb = 0;
        kscroll = 0;
        fxmax = '\ubb80';
        fymax = '\ua410';
        stagedate = new byte[17][2001];
        blacktm = 1;
        blackx = 0;
        xx = new int[91];
        xd = new double[11];
        xs = new String[31];
        co = new Color(255, 0, 255);
        stagedatex = new byte[1024][18];
    }

    static void wait2(long var0, long var2, int var4) {
        try {
            if (var2 - var0 < (long) var4) {
                Thread.sleep((long) var4 - (var2 - var0));
            }
        } catch (InterruptedException var6) {
            ;
        }

    }

    static int rand(int var0) {
        return Math.abs(ZZ.nextInt() % var0);
    }

    public void init() {
        setBackground(Color.black);
        addKeyListener(this);
        if (h == null) {
            buf = createImage(getSize().width, getSize().height);
            h = buf.getGraphics();
        }

        mt = new MediaTracker(this);
        mgrap[0] = getImage(getDocumentBase(), "res/player.PNG");
        mgrap[1] = getImage(getDocumentBase(), "res/brock.PNG");
        mgrap[2] = getImage(getDocumentBase(), "res/item.PNG");
        mgrap[3] = getImage(getDocumentBase(), "res/teki.PNG");
        mgrap[4] = getImage(getDocumentBase(), "res/haikei.PNG");
        mgrap[5] = getImage(getDocumentBase(), "res/brock2.PNG");
        mgrap[6] = getImage(getDocumentBase(), "res/omake.PNG");
        mgrap[7] = getImage(getDocumentBase(), "res/omake2.PNG");
        mgrap[30] = getImage(getDocumentBase(), "res/syobon3.PNG");

        for (t = 0; t <= 7; ++t) {
            mt.addImage(mgrap[t], t);
        }

        try {
            mt.waitForAll();
        } catch (InterruptedException var6) {
            ;
        }

        mt.addImage(mgrap[30], 30);

        try {
            mt.waitForAll();
        } catch (InterruptedException var5) {
            ;
        }

        grap[40][0] = DerivationGraph(0, 0, 30, 36, mgrap[0]);
        grap[0][0] = DerivationGraph(124, 0, 30, 36, mgrap[0]);
        grap[1][0] = DerivationGraph(31, 0, 30, 36, mgrap[0]);
        grap[2][0] = DerivationGraph(62, 0, 30, 36, mgrap[0]);
        grap[3][0] = DerivationGraph(93, 0, 30, 36, mgrap[0]);
        grap[41][0] = DerivationGraph(50, 0, 51, 73, mgrap[6]);
        byte var1 = 1;

        for (t = 0; t <= 6; ++t) {
            grap[t][var1] = DerivationGraph(33 * t, 0, 30, 30, mgrap[var1]);
            grap[t + 30][var1] = DerivationGraph(33 * t, 33, 30, 30, mgrap[var1]);
            grap[t + 60][var1] = DerivationGraph(33 * t, 66, 30, 30, mgrap[var1]);
        }

        grap[8][var1] = DerivationGraph(231, 0, 30, 30, mgrap[var1]);
        grap[16][var1] = DerivationGraph(198, 0, 24, 27, mgrap[2]);
        var1 = 5;

        for (t = 0; t <= 6; ++t) {
            grap[t][var1] = DerivationGraph(33 * t, 0, 30, 30, mgrap[var1]);
        }

        grap[10][5] = DerivationGraph(33, 33, 30, 30, mgrap[var1]);
        grap[11][5] = DerivationGraph(66, 33, 30, 30, mgrap[var1]);
        grap[12][5] = DerivationGraph(0, 66, 30, 30, mgrap[var1]);
        grap[13][5] = DerivationGraph(33, 66, 30, 30, mgrap[var1]);
        grap[14][5] = DerivationGraph(66, 66, 30, 30, mgrap[var1]);
        var1 = 2;

        for (t = 0; t <= 5; ++t) {
            grap[t][var1] = DerivationGraph(33 * t, 0, 30, 30, mgrap[var1]);
        }

        var1 = 3;
        grap[0][var1] = DerivationGraph(0, 0, 30, 30, mgrap[var1]);
        grap[1][var1] = DerivationGraph(33, 0, 30, 43, mgrap[var1]);
        grap[2][var1] = DerivationGraph(66, 0, 30, 30, mgrap[var1]);
        grap[3][var1] = DerivationGraph(99, 0, 30, 44, mgrap[var1]);
        grap[4][var1] = DerivationGraph(132, 0, 33, 35, mgrap[var1]);
        grap[5][var1] = DerivationGraph(0, 0, 37, 55, mgrap[7]);
        grap[6][var1] = DerivationGraph(76, 0, 36, 50, mgrap[7]);
        grap[150][var1] = DerivationGraph(150, 0, 36, 50, mgrap[7]);
        grap[7][var1] = DerivationGraph(199, 0, 32, 32, mgrap[var1]);
        grap[8][var1] = DerivationGraph(187, 0, 37, 47, mgrap[7]);
        grap[151][var1] = DerivationGraph(225, 0, 37, 47, mgrap[7]);
        grap[9][var1] = DerivationGraph(232, 0, 26, 30, mgrap[var1]);
        grap[10][var1] = DerivationGraph(214, 0, 46, 16, mgrap[6]);
        grap[30][var1] = DerivationGraph(0, 56, 30, 36, mgrap[7]);
        grap[155][var1] = DerivationGraph(93, 56, 30, 36, mgrap[7]);
        grap[31][var1] = DerivationGraph(50, 74, 49, 79, mgrap[6]);
        grap[80][var1] = DerivationGraph(151, 31, 70, 40, mgrap[4]);
        grap[81][var1] = DerivationGraph(151, 72, 70, 40, mgrap[4]);
        grap[130][var1] = DerivationGraph(222, 72, 70, 40, mgrap[4]);
        grap[82][var1] = DerivationGraph(33, 0, 30, 30, mgrap[5]);
        grap[83][var1] = DerivationGraph(0, 0, 49, 48, mgrap[6]);
        grap[84][var1] = DerivationGraph(166, 0, 30, 30, mgrap[var1]);
        grap[86][var1] = DerivationGraph(102, 66, 49, 59, mgrap[6]);
        grap[152][var1] = DerivationGraph(152, 66, 49, 59, mgrap[6]);
        grap[90][var1] = DerivationGraph(102, 0, 64, 63, mgrap[6]);
        grap[100][var1] = DerivationGraph(33, 0, 30, 30, mgrap[2]);
        grap[101][var1] = DerivationGraph(231, 0, 30, 30, mgrap[2]);
        grap[102][var1] = DerivationGraph(99, 0, 30, 30, mgrap[2]);
        grap[105][var1] = DerivationGraph(165, 0, 30, 30, mgrap[2]);
        grap[110][var1] = DerivationGraph(132, 0, 30, 30, mgrap[2]);
        var1 = 4;
        grap[0][var1] = DerivationGraph(0, 0, 150, 90, mgrap[var1]);
        grap[1][var1] = DerivationGraph(151, 0, 65, 29, mgrap[var1]);
        grap[2][var1] = DerivationGraph(151, 31, 70, 40, mgrap[var1]);
        grap[3][var1] = DerivationGraph(0, 91, 100, 90, mgrap[var1]);
        grap[4][var1] = DerivationGraph(151, 113, 51, 29, mgrap[var1]);
        grap[5][var1] = DerivationGraph(222, 0, 28, 60, mgrap[var1]);
        grap[6][var1] = DerivationGraph(151, 143, 90, 40, mgrap[var1]);
        grap[20][var1] = DerivationGraph(0, 182, 40, 60, mgrap[var1]);
        var1 = 5;
        grap[0][var1] = DerivationGraph(167, 0, 45, 45, mgrap[6]);
        var1 = 3;

        for (t = 0; t <= 140; ++t) {
            try {
                anx[t] = grap[t][var1].getWidth(this) * 100;
                any[t] = grap[t][var1].getHeight(this) * 100;
            } catch (Exception var4) {
                anx[t] = 1;
                any[t] = 1;
            }
        }

        anx[79] = 12000;
        any[79] = 1500;
        anx[85] = 2500;
        any[85] = 30000;
        var1 = 4;

        for (t = 0; t < 40; ++t) {
            try {
                ne[t] = grap[t][var1].getWidth(this) * 100;
                nf[t] = grap[t][var1].getHeight(this) * 100;
            } catch (Exception var3) {
                ne[t] = 1;
                nf[t] = 1;
            }
        }

        oto[100] = LoadSoundMem("BGM/titerman.mid");
        oto[103] = LoadSoundMem("BGM/speran.mid");
        oto[104] = LoadSoundMem("BGM/star4.mp3.wav");
        oto[105] = LoadSoundMem("BGM/makaimura.mid");
        oto[106] = LoadSoundMem("BGM/puyo16k.wav");
        oto[1] = LoadSoundMem("SE/jump.mp3.wav");
        oto[3] = LoadSoundMem("SE/brockbreak.mp3.wav");
        oto[4] = LoadSoundMem("SE/coin.mp3.wav");
        oto[5] = LoadSoundMem("SE/humi.mp3.wav");
        oto[6] = LoadSoundMem("SE/koura.mp3.wav");
        oto[7] = LoadSoundMem("SE/dokan.mp3.wav");
        oto[8] = LoadSoundMem("SE/brockkinoko.mp3.wav");
        oto[9] = LoadSoundMem("SE/powerup.mp3.wav");
        oto[10] = LoadSoundMem("SE/kirra.mp3.wav");
        oto[11] = LoadSoundMem("SE/goal.mp3.wav");
        oto[12] = LoadSoundMem("SE/death.mp3.wav");
        oto[13] = LoadSoundMem("SE/Pswitch.mp3.wav");
        oto[14] = LoadSoundMem("SE/jumpBlock.mp3.wav");
        oto[15] = LoadSoundMem("SE/hintBlock.mp3.wav");
        oto[16] = LoadSoundMem("SE/4-clear.mp3.wav");
        oto[17] = LoadSoundMem("SE/allclear.mp3.wav");
        oto[18] = LoadSoundMem("SE/tekifire.mp3.wav");
        xx[27] = 5;
        setfont(20, 4);
    }

    public void start() {
        if (Z == null) {
            Z = new Thread(this);
            Z.start();
        }

    }

    public void stop() {
        if (Z != null) {
            Z = null;
        }

    }

    public void destroy() {
        StopSoundMem(oto[0]);
    }

    public void update(Graphics var1) {
        paint(var1);
    }

    public void paint(Graphics var1) {
        h.clearRect(0, 0, 640, 480);
        setcolor(0, 0, 0);
        if (stagecolor == 1) {
            setcolor(160, 180, 250);
        }

        if (stagecolor == 2) {
            setcolor(10, 10, 10);
        }

        if (stagecolor == 3) {
            setcolor(160, 180, 250);
        }

        if (stagecolor == 4) {
            setcolor(10, 10, 10);
        }

        fillrect(0, 0, fxmax, fymax);
        if (main == 1 && zxon >= 1) {
            for (t = 0; t < nmax; ++t) {
                xx[0] = na[t] - fx;
                xx[1] = nb[t] - fy;
                xx[2] = 16000;
                xx[3] = 16000;
                if (xx[0] + xx[2] >= -10 && xx[0] <= fxmax && xx[1] + xx[3] >= -10 && xx[3] <= fymax) {
                    if (ntype[t] != 3) {
                        drawimage(grap[ntype[t]][4], xx[0] / 100, xx[1] / 100);
                    }

                    if (ntype[t] == 3) {
                        drawimage(grap[ntype[t]][4], xx[0] / 100 - 5, xx[1] / 100);
                    }

                    if (ntype[t] == 100) {
                        setcolor(255, 255, 255);
                        str("51", xx[0] / 100 + fma, xx[1] / 100 + fmb);
                    }

                    if (ntype[t] == 101) {
                        setcolor(255, 255, 255);
                        str("ゲームクリアー", xx[0] / 100 + fma, xx[1] / 100 + fmb);
                    }

                    if (ntype[t] == 102) {
                        setcolor(255, 255, 255);
                        str("プレイしてくれてありがとー", xx[0] / 100 + fma, xx[1] / 100 + fmb);
                    }
                }
            }

            for (t = 0; t < emax; ++t) {
                xx[0] = ea[t] - fx;
                xx[1] = eb[t] - fy;
                xx[2] = enobia[t] / 100;
                xx[3] = enobib[t] / 100;
                if (xx[0] + xx[2] * 100 >= -10 && xx[1] <= fxmax && xx[1] + xx[3] * 100 >= -8010 && xx[3] <= fymax) {
                    if (egtype[t] == 0) {
                        drawimage(grap[0][2], xx[0] / 100, xx[1] / 100);
                    }

                    if (egtype[t] == 1) {
                        if (stagecolor <= 1 || stagecolor == 3) {
                            setcolor(144, 96, 48);
                        }

                        if (stagecolor == 2) {
                            setcolor(0, 120, 160);
                        }

                        if (stagecolor == 4) {
                            setcolor(192, 192, 192);
                        }

                        fillarc(xx[0] / 100, xx[1] / 100, 7, 7);
                        setcolor(0, 0, 0);
                        drawarc(xx[0] / 100, xx[1] / 100, 7, 7);
                    }

                    if (egtype[t] == 2 || egtype[t] == 3) {
                        if (egtype[t] == 3) {
                            mirror = 1;
                        }

                        drawimage(grap[0][5], xx[0] / 100, xx[1] / 100);
                        mirror = 0;
                    }

                    if (egtype[t] == 4) {
                        setc1();
                        fillrect(xx[0] / 100 + 10, xx[1] / 100, 10, xx[3]);
                        setc0();
                        drawrect(xx[0] / 100 + 10, xx[1] / 100, 10, xx[3]);
                        setcolor(250, 250, 0);
                        fillarc(xx[0] / 100 + 15 - 1, xx[1] / 100, 10, 10);
                        setc0();
                        drawarc(xx[0] / 100 + 15 - 1, xx[1] / 100, 10, 10);
                    }
                }
            }

            for (t = 0; t < srmax; ++t) {
                xx[0] = sra[t] - fx;
                xx[1] = srb[t] - fy;
                if (xx[0] + src[t] >= -10 && xx[1] <= fxmax + 12100 && src[t] / 100 >= 1) {
                    xx[2] = 14;
                    if (srsp[t] == 1) {
                        xx[2] = 12;
                    }

                    if (srsp[t] > 9 && srsp[t] < 20) {
                        if (srsp[t] <= 14 && src[t] >= 5000) {
                            setcolor(0, 200, 0);
                            fillrect((sra[t] - fx) / 100, (srb[t] - fy) / 100, src[t] / 100, 30);
                            setcolor(0, 160, 0);
                            drawrect((sra[t] - fx) / 100, (srb[t] - fy) / 100, src[t] / 100, 30);
                            setcolor(180, 120, 60);
                            fillrect((sra[t] - fx) / 100 + 20, (srb[t] - fy) / 100 + 30, src[t] / 100 - 40, 480);
                            setcolor(100, 80, 20);
                            drawrect((sra[t] - fx) / 100 + 20, (srb[t] - fy) / 100 + 30, src[t] / 100 - 40, 480);
                        }
                    } else {
                        setcolor(220, 220, 0);
                        if (srsp[t] == 2) {
                            setcolor(0, 220, 0);
                        }

                        if (srsp[t] == 21) {
                            setcolor(180, 180, 180);
                        }

                        fillrect((sra[t] - fx) / 100, (srb[t] - fy) / 100, src[t] / 100, xx[2]);
                        setcolor(180, 180, 0);
                        if (srsp[t] == 2) {
                            setcolor(0, 180, 0);
                        }

                        if (srsp[t] == 21) {
                            setcolor(150, 150, 150);
                        }

                        drawrect((sra[t] - fx) / 100, (srb[t] - fy) / 100, src[t] / 100, xx[2]);
                    }

                    if (srsp[t] == 15) {
                        for (t2 = 0; t2 <= 2; ++t2) {
                            xx[6] = 1;
                            drawimage(grap[xx[6]][1], (sra[t] - fx) / 100 + t2 * 29, (srb[t] - fy) / 100);
                        }
                    }
                }
            }

            setcolor(0, 0, 255);
            if (mactp >= 2000) {
                mactp -= 2000;
                if (mact == 0) {
                    mact = 1;
                } else {
                    mact = 0;
                }
            }

            if (mmuki == 0) {
                mirror = 1;
            }

            if (mtype != 200 && mtype != 1) {
                if (mzimen == 1) {
                    if (mact == 0) {
                        drawimage(grap[0][0], ma / 100, mb / 100);
                    }

                    if (mact == 1) {
                        drawimage(grap[1][0], ma / 100, mb / 100);
                    }
                }

                if (mzimen == 0) {
                    drawimage(grap[2][0], ma / 100, mb / 100);
                }
            } else if (mtype == 1) {
                drawimage(grap[41][0], ma / 100, mb / 100);
            } else if (mtype == 200) {
                drawimage(grap[3][0], ma / 100, mb / 100);
            }

            mirror = 0;

            for (t = 0; t < amax; ++t) {
                xx[0] = aa[t] - fx;
                xx[1] = ab[t] - fy;
                xx[2] = anobia[t] / 100;
                xx[3] = anobib[t] / 100;
                xx[14] = 3000;
                xx[16] = 0;
                if (xx[0] + xx[2] * 100 >= -10 - xx[14] && xx[1] <= fxmax + xx[14] && xx[1] + xx[3] * 100 >= -10 && xx[3] <= fymax) {
                    if (amuki[t] == 1) {
                        mirror = 1;
                    }

                    if (atype[t] == 3 && axtype[t] == 1) {
                        h.drawImage(grap[atype[t]][3], xx[0] / 100, xx[1] / 100 + grap[atype[t]][3].getHeight(this), grap[atype[t]][3].getWidth(this), -grap[atype[t]][3].getHeight(this), this);
                        xx[16] = 1;
                    }

                    if (atype[t] == 9 && ad[t] >= 1) {
                        h.drawImage(grap[atype[t]][3], xx[0] / 100, xx[1] / 100 + grap[atype[t]][3].getHeight(this), grap[atype[t]][3].getWidth(this), -grap[atype[t]][3].getHeight(this), this);
                        xx[16] = 1;
                    }

                    if (atype[t] >= 100 && amuki[t] == 1) {
                        mirror = 0;
                    }

                    if (atype[t] < 200 && xx[16] == 0 && atype[t] != 6 && atype[t] != 79 && atype[t] != 86 && atype[t] != 30 && (atype[t] != 80 && atype[t] != 81 || axtype[t] != 1)) {
                        drawimage(grap[atype[t]][3], xx[0] / 100, xx[1] / 100);
                    }

                    if (atype[t] == 6) {
                        if ((atm[t] < 10 || atm[t] > 19) && (atm[t] < 100 || atm[t] > 119) && atm[t] < 200) {
                            drawimage(grap[6][3], xx[0] / 100, xx[1] / 100);
                        } else {
                            drawimage(grap[150][3], xx[0] / 100, xx[1] / 100);
                        }
                    }

                    if (atype[t] == 30) {
                        if (axtype[t] == 0) {
                            drawimage(grap[30][3], xx[0] / 100, xx[1] / 100);
                        }

                        if (axtype[t] == 1) {
                            drawimage(grap[155][3], xx[0] / 100, xx[1] / 100);
                        }
                    }

                    if (atype[t] == 81 && axtype[t] == 1) {
                        drawimage(grap[130][3], xx[0] / 100, xx[1] / 100);
                    }

                    if (atype[t] == 79) {
                        setcolor(250, 250, 0);
                        fillrect(xx[0] / 100, xx[1] / 100, xx[2], xx[3]);
                        setc0();
                        drawrect(xx[0] / 100, xx[1] / 100, xx[2], xx[3]);
                    }

                    if (atype[t] == 82) {
                        if (axtype[t] == 1) {
                            xx[9] = 0;
                            if (stagecolor == 2) {
                                xx[9] = 30;
                            }

                            if (stagecolor == 4) {
                                xx[9] = 60;
                            }

                            xx[6] = 4 + xx[9];
                            drawimage(grap[xx[6]][1], xx[0] / 100, xx[1] / 100);
                        }

                        if (axtype[t] == 2) {
                            drawimage(grap[1][5], xx[0] / 100, xx[1] / 100);
                        }
                    }

                    if (atype[t] == 83 && axtype[t] == 1) {
                        xx[9] = 0;
                        if (stagecolor == 2) {
                            xx[9] = 30;
                        }

                        if (stagecolor == 4) {
                            xx[9] = 60;
                        }

                        xx[6] = 4 + xx[9];
                        drawimage(grap[xx[6]][1], xx[0] / 100 + 10, xx[1] / 100 + 9);
                    }

                    if (atype[t] == 85) {
                        setc1();
                        fillrect(xx[0] / 100 + 10, xx[1] / 100, 10, xx[3]);
                        setc0();
                        drawrect(xx[0] / 100 + 10, xx[1] / 100, 10, xx[3]);
                        setcolor(0, 250, 200);
                        fillarc(xx[0] / 100 + 15 - 1, xx[1] / 100, 10, 10);
                        setc0();
                        drawarc(xx[0] / 100 + 15 - 1, xx[1] / 100, 10, 10);
                    }

                    if (atype[t] == 86) {
                        if (ma >= aa[t] - fx - mnobia - 4000 && ma <= aa[t] - fx + anobia[t] + 4000) {
                            drawimage(grap[152][3], xx[0] / 100, xx[1] / 100);
                        } else {
                            drawimage(grap[86][3], xx[0] / 100, xx[1] / 100);
                        }
                    }

                    if (atype[t] == 200) {
                        drawimage(grap[0][3], xx[0] / 100, xx[1] / 100);
                    }

                    mirror = 0;
                }
            }

            for (t = 0; t < tmax; ++t) {
                xx[0] = ta[t] - fx;
                xx[1] = tb[t] - fy;
                xx[2] = 32;
                xx[3] = xx[2];
                if (xx[0] + xx[2] * 100 >= -10 && xx[1] <= fxmax) {
                    xx[9] = 0;
                    if (stagecolor == 2) {
                        xx[9] = 30;
                    }

                    if (stagecolor == 4) {
                        xx[9] = 60;
                    }

                    if (ttype[t] < 100) {
                        xx[6] = ttype[t] + xx[9];
                        drawimage(grap[xx[6]][1], xx[0] / 100, xx[1] / 100);
                    }

                    if (ttype[t] == 100 || ttype[t] == 101 || ttype[t] == 102 || ttype[t] == 103 || ttype[t] == 104 && txtype[t] == 1 || ttype[t] == 114 && txtype[t] == 1 || ttype[t] == 116) {
                        xx[6] = 2 + xx[9];
                        drawimage(grap[xx[6]][1], xx[0] / 100, xx[1] / 100);
                    }

                    if (ttype[t] == 112 || ttype[t] == 104 && txtype[t] == 0 || ttype[t] == 115 && txtype[t] == 1) {
                        xx[6] = 1 + xx[9];
                        drawimage(grap[xx[6]][1], xx[0] / 100, xx[1] / 100);
                    }

                    if (ttype[t] == 111 || ttype[t] == 113 || ttype[t] == 115 && txtype[t] == 0 || ttype[t] == 124) {
                        xx[6] = 3 + xx[9];
                        drawimage(grap[xx[6]][1], xx[0] / 100, xx[1] / 100);
                    }

                    if (ttype[t] == 117 && txtype[t] == 1) {
                        drawimage(grap[4][5], xx[0] / 100, xx[1] / 100);
                    }

                    if (ttype[t] == 117 && txtype[t] >= 3) {
                        drawimage(grap[3][5], xx[0] / 100, xx[1] / 100);
                    }

                    if (ttype[t] == 115 && txtype[t] == 3) {
                        xx[6] = 1 + xx[9];
                        drawimage(grap[xx[6]][1], xx[0] / 100, xx[1] / 100);
                    }

                    if (ttype[t] == 120 && txtype[t] != 1) {
                        drawimage(grap[16][1], xx[0] / 100 + 3, xx[1] / 100 + 2);
                    }

                    if (ttype[t] == 130) {
                        drawimage(grap[10][5], xx[0] / 100, xx[1] / 100);
                    }

                    if (ttype[t] == 131) {
                        drawimage(grap[11][5], xx[0] / 100, xx[1] / 100);
                    }

                    if (ttype[t] == 140) {
                        drawimage(grap[12][5], xx[0] / 100, xx[1] / 100);
                    }

                    if (ttype[t] == 141) {
                        drawimage(grap[13][5], xx[0] / 100, xx[1] / 100);
                    }

                    if (ttype[t] == 142) {
                        drawimage(grap[14][5], xx[0] / 100, xx[1] / 100);
                    }

                    if (ttype[t] == 300 || ttype[t] == 301) {
                        drawimage(grap[1][5], xx[0] / 100, xx[1] / 100);
                    }

                    if (ttype[t] == 400) {
                        drawimage(grap[2][5], xx[0] / 100, xx[1] / 100);
                    }

                    if (ttype[t] == 800) {
                        drawimage(grap[0][2], xx[0] / 100 + 2, xx[1] / 100 + 1);
                    }
                }
            }

            for (t = 0; t < smax; ++t) {
                if (sa[t] - fx + sc[t] >= -10 && sa[t] - fx <= fxmax + 1100) {
                    if (stype[t] == 0) {
                        setcolor(40, 200, 40);
                        fillrect((sa[t] - fx) / 100 + fma, (sb[t] - fy) / 100 + fmb, sc[t] / 100, sd[t] / 100);
                        drawrect((sa[t] - fx) / 100 + fma, (sb[t] - fy) / 100 + fmb, sc[t] / 100, sd[t] / 100);
                    }

                    if (stype[t] == 1) {
                        setcolor(0, 230, 0);
                        fillrect((sa[t] - fx) / 100 + fma, (sb[t] - fy) / 100 + fmb - 1, sc[t] / 100, sd[t] / 100);
                        setc0();
                        drawrect((sa[t] - fx) / 100 + fma, (sb[t] - fy) / 100 + fmb - 1, sc[t] / 100, sd[t] / 100);
                    }

                    if (stype[t] == 2) {
                        setcolor(0, 230, 0);
                        fillrect((sa[t] - fx) / 100 + fma, (sb[t] - fy) / 100 + fmb + 1, sc[t] / 100, sd[t] / 100);
                        setc0();
                        drawline((sa[t] - fx) / 100 + fma, (sb[t] - fy) / 100 + fmb, (sa[t] - fx) / 100 + fma, (sb[t] - fy) / 100 + fmb + sd[t] / 100);
                        drawline((sa[t] - fx) / 100 + fma + sc[t] / 100, (sb[t] - fy) / 100 + fmb, (sa[t] - fx) / 100 + fma + sc[t] / 100, (sb[t] - fy) / 100 + fmb + sd[t] / 100);
                    }

                    if (stype[t] == 5) {
                        setcolor(0, 230, 0);
                        fillrect((sa[t] - fx) / 100 + fma, (sb[t] - fy) / 100 + fmb + 1, sc[t] / 100, sd[t] / 100);
                        setc0();
                        drawline((sa[t] - fx) / 100 + fma, (sb[t] - fy) / 100 + fmb, (sa[t] - fx) / 100 + fma + sc[t] / 100, (sb[t] - fy) / 100 + fmb);
                        drawline((sa[t] - fx) / 100 + fma, (sb[t] - fy) / 100 + fmb + sd[t] / 100, (sa[t] - fx) / 100 + fma + sc[t] / 100, (sb[t] - fy) / 100 + fmb + sd[t] / 100);
                    }

                    if (stype[t] == 51) {
                        if (sxtype[t] == 0) {
                            for (t3 = 0; t3 <= sc[t] / 3000; ++t3) {
                                drawimage(grap[1][1], (sa[t] - fx) / 100 + fma + 29 * t3, (sb[t] - fy) / 100 + fmb);
                            }
                        }

                        if (sxtype[t] == 1 || sxtype[t] == 2) {
                            for (t3 = 0; t3 <= sc[t] / 3000; ++t3) {
                                drawimage(grap[31][1], (sa[t] - fx) / 100 + fma + 29 * t3, (sb[t] - fy) / 100 + fmb);
                            }
                        }

                        if (sxtype[t] == 3 || sxtype[t] == 4) {
                            for (t3 = 0; t3 <= sc[t] / 3000; ++t3) {
                                for (t2 = 0; t2 <= sd[t] / 3000; ++t2) {
                                    drawimage(grap[65][1], (sa[t] - fx) / 100 + fma + 29 * t3, (sb[t] - fy) / 100 + 29 * t2 + fmb);
                                }
                            }
                        }

                        if (sxtype[t] == 10) {
                            for (t3 = 0; t3 <= sc[t] / 3000; ++t3) {
                                drawimage(grap[65][1], (sa[t] - fx) / 100 + fma + 29 * t3, (sb[t] - fy) / 100 + fmb);
                            }
                        }
                    }

                    if (stype[t] == 52) {
                        xx[29] = 0;
                        if (stagecolor == 2) {
                            xx[29] = 30;
                        }

                        if (stagecolor == 4) {
                            xx[29] = 60;
                        }

                        for (t3 = 0; t3 <= sc[t] / 3000; ++t3) {
                            if (sxtype[t] == 0) {
                                drawimage(grap[5 + xx[29]][1], (sa[t] - fx) / 100 + fma + 29 * t3, (sb[t] - fy) / 100 + fmb);
                                if (stagecolor != 4) {
                                    drawimage(grap[6 + xx[29]][1], (sa[t] - fx) / 100 + fma + 29 * t3, (sb[t] - fy) / 100 + fmb + 29);
                                } else {
                                    drawimage(grap[5 + xx[29]][1], (sa[t] - fx) / 100 + fma + 29 * t3, (sb[t] - fy) / 100 + fmb + 29);
                                }
                            }

                            if (sxtype[t] == 1) {
                                for (t2 = 0; t2 <= sd[t] / 3000; ++t2) {
                                    drawimage(grap[1 + xx[29]][1], (sa[t] - fx) / 100 + fma + 29 * t3, (sb[t] - fy) / 100 + fmb + 29 * t2);
                                }
                            }
                        }
                    }

                    if (trap == 1 && stype[t] >= 100 && stype[t] <= 299) {
                        if (stagecolor <= 1 || stagecolor == 3) {
                            setc0();
                        }

                        if (stagecolor == 2 || stagecolor == 4) {
                            setc1();
                        }

                        drawrect((sa[t] - fx) / 100 + fma, (sb[t] - fy) / 100 + fmb, sc[t] / 100, sd[t] / 100);
                    }

                    if (stype[t] == 300) {
                        setc1();
                        fillrect((sa[t] - fx) / 100 + 10, (sb[t] - fy) / 100, 10, sd[t] / 100 - 8);
                        setc0();
                        drawrect((sa[t] - fx) / 100 + 10, (sb[t] - fy) / 100, 10, sd[t] / 100 - 8);
                        setcolor(250, 250, 0);
                        fillarc((sa[t] - fx) / 100 + 15 - 1, (sb[t] - fy) / 100, 10, 10);
                        setc0();
                        drawarc((sa[t] - fx) / 100 + 15 - 1, (sb[t] - fy) / 100, 10, 10);
                    }

                    if (stype[t] == 500) {
                        drawimage(grap[20][4], (sa[t] - fx) / 100, (sb[t] - fy) / 100);
                    }
                }
            }

            for (t = 0; t < smax; ++t) {
                if (sa[t] - fx + sc[t] >= -10 && sa[t] - fx <= fxmax + 1100) {
                    if (stype[t] == 40) {
                        setcolor(0, 230, 0);
                        fillrect((sa[t] - fx) / 100 + fma, (sb[t] - fy) / 100 + fmb + 1, sc[t] / 100, sd[t] / 100);
                        setc0();
                        drawrect((sa[t] - fx) / 100 + fma, (sb[t] - fy) / 100 + fmb + 1, sc[t] / 100, sd[t] / 100);
                    }

                    if (stype[t] == 50) {
                        setcolor(0, 230, 0);
                        fillrect((sa[t] - fx) / 100 + fma + 5, (sb[t] - fy) / 100 + fmb + 30, 50, sd[t] / 100 - 30);
                        setc0();
                        drawline((sa[t] - fx) / 100 + 5 + fma, (sb[t] - fy) / 100 + fmb + 30, (sa[t] - fx) / 100 + fma + 5, (sb[t] - fy) / 100 + fmb + sd[t] / 100);
                        drawline((sa[t] - fx) / 100 + 5 + fma + 50, (sb[t] - fy) / 100 + fmb + 30, (sa[t] - fx) / 100 + fma + 50 + 5, (sb[t] - fy) / 100 + fmb + sd[t] / 100);
                        setcolor(0, 230, 0);
                        fillrect((sa[t] - fx) / 100 + fma, (sb[t] - fy) / 100 + fmb + 1, 60, 30);
                        setc0();
                        drawrect((sa[t] - fx) / 100 + fma, (sb[t] - fy) / 100 + fmb + 1, 60, 30);
                    }

                    if (stype[t] == 200) {
                        for (t3 = 0; t3 <= sc[t] / 3000; ++t3) {
                            for (t2 = 0; t2 <= sd[t] / 3000; ++t2) {
                                drawimage(grap[65][1], (sa[t] - fx) / 100 + fma + 29 * t3, (sb[t] - fy) / 100 + 29 * t2 + fmb);
                            }
                        }
                    }
                }
            }

            for (t = 0; t < amax; ++t) {
                xx[0] = aa[t] - fx;
                xx[1] = ab[t] - fy;
                xx[14] = 12000;
                xx[16] = 0;
                if (atype[t] == 87 && xx[0] + xx[2] * 100 >= -10 - xx[14] && xx[1] <= fxmax + xx[14] && xx[1] + xx[3] * 100 >= -10 && xx[3] <= fymax) {
                    for (tt = 0; tt <= axtype[t] % 100; ++tt) {
                        xx[26] = 18;
                        xd[4] = (double) (tt * xx[26]) * Math.cos((double) atm[t] * pai / 180.0D / 2.0D);
                        xd[5] = (double) (tt * xx[26]) * Math.sin((double) atm[t] * pai / 180.0D / 2.0D);
                        xx[24] = (int) xd[4];
                        xx[25] = (int) xd[5];
                        setcolor(230, 120, 0);
                        xx[23] = 8;
                        fillarc(xx[0] / 100 + xx[24], xx[1] / 100 + xx[25], xx[23], xx[23]);
                        setcolor(0, 0, 0);
                        drawarc(xx[0] / 100 + xx[24], xx[1] / 100 + xx[25], xx[23], xx[23]);
                    }
                }
            }

            setc0();
            if (mmsgtm >= 1) {
                --mmsgtm;
                xs[0] = "";
                if (mmsgtype == 1) {
                    xs[0] = "おいしい…";
                }

                if (mmsgtype == 2) {
                    xs[0] = "まずい…";
                }

                if (mmsgtype == 3) {
                    xs[0] = "ぐふぅ!!";
                }

                if (mmsgtype == 10) {
                    xs[0] = "うほっ!!!!";
                }

                if (mmsgtype == 11) {
                    xs[0] = "燃えるぅーー!!";
                }

                if (mmsgtype == 50) {
                    xs[0] = "あづーーーー!!";
                }

                if (mmsgtype == 51) {
                    xs[0] = "ファイアー!!!!";
                }

                if (mmsgtype == 52) {
                    xs[0] = "オワタｗ";
                }

                if (mmsgtype == 53) {
                    xs[0] = "あ、足が～!!";
                }

                if (mmsgtype == 54) {
                    xs[0] = "熱すぎる!!";
                }

                if (mmsgtype == 55) {
                    xs[0] = "私は燃え尽きてしまった";
                }

                setc0();
                str(xs[0], (ma + mnobia + 300) / 100 - 1, mb / 100 - 1);
                str(xs[0], (ma + mnobia + 300) / 100 + 1, mb / 100 + 1);
                setc1();
                str(xs[0], (ma + mnobia + 300) / 100, mb / 100);
            }

            setc0();

            for (t = 0; t < amax; ++t) {
                if (amsgtm[t] >= 1) {
                    --amsgtm[t];
                    xs[0] = "";
                    if (amsgtype[t] == 1001) {
                        xs[0] = "遅すぎるんだよ!!";
                    }

                    if (amsgtype[t] == 1002) {
                        xs[0] = "無駄無駄無駄無駄ァ!!";
                    }

                    if (amsgtype[t] == 1003) {
                        xs[0] = "テラヨワス";
                    }

                    if (amsgtype[t] == 1004) {
                        xs[0] = "ぷー クスクス";
                    }

                    if (amsgtype[t] == 1005) {
                        xs[0] = "強靭!!無敵!!最強!!!!";
                    }

                    if (amsgtype[t] == 1006) {
                        xs[0] = "性能の差だな…";
                    }

                    if (amsgtype[t] == 1007) {
                        xs[0] = "カエレ!!";
                    }

                    if (amsgtype[t] == 1008) {
                        xs[0] = "ニマニマ";
                    }

                    if (amsgtype[t] == 1011) {
                        xs[0] = "嘘だ!!";
                    }

                    if (amsgtype[t] == 1012) {
                        xs[0] = "HE☆TA☆RE";
                    }

                    if (amsgtype[t] == 1013) {
                        xs[0] = "ごめんねぇ 強くてさぁ!!";
                    }

                    if (amsgtype[t] == 1014) {
                        xs[0] = "貴様 それでも軍人か!?";
                    }

                    if (amsgtype[t] == 1015) {
                        xs[0] = "ゆとりはいい 想像を絶する";
                    }

                    if (amsgtype[t] == 1016) {
                        xs[0] = "粛清してやる!!";
                    }

                    if (amsgtype[t] == 1017) {
                        xs[0] = "さぁ 悪い子はどんどん(ry";
                    }

                    if (amsgtype[t] == 1018) {
                        xs[0] = "戦闘力 1 のごみくずが…";
                    }

                    if (amsgtype[t] == 1021) {
                        xs[0] = "グゥレイトォ!!";
                    }

                    if (amsgtype[t] == 1022) {
                        xs[0] = "ポルポルポルポルゥ!!";
                    }

                    if (amsgtype[t] == 1023) {
                        xs[0] = "ヤッフー!!";
                    }

                    if (amsgtype[t] == 1024) {
                        xs[0] = "フハハハハハハ";
                    }

                    if (amsgtype[t] == 1025) {
                        xs[0] = "神に祈る間をやろう";
                    }

                    if (amsgtype[t] == 1026) {
                        xs[0] = "ざわ…ざわ……";
                    }

                    if (amsgtype[t] == 1027) {
                        xs[0] = "え？俺勝っちゃったの？";
                    }

                    if (amsgtype[t] == 1028) {
                        xs[0] = "これぞ 必 殺!!";
                    }

                    if (amsgtype[t] == 15) {
                        xs[0] = "鉄壁!!よって、無敵!!";
                    }

                    if (amsgtype[t] == 18) {
                        xs[0] = "ざまぁｗ";
                    }

                    if (amsgtype[t] == 20) {
                        xs[0] = "Zzz";
                    }

                    if (amsgtype[t] == 21) {
                        xs[0] = "ク、クマー";
                    }

                    if (amsgtype[t] == 24) {
                        xs[0] = "？";
                    }

                    if (amsgtype[t] == 25) {
                        xs[0] = "うほっ!!!!";
                    }

                    if (amsgtype[t] == 30) {
                        xs[0] = "うめぇ!!";
                    }

                    if (amsgtype[t] == 31) {
                        xs[0] = "シャキーン";
                    }

                    if (amsgtype[t] == 50) {
                        xs[0] = "ビーー";
                    }

                    if (amsgtype[t] == 85) {
                        xs[0] = "ポールアターック!!";
                    }

                    if (amsgtype[t] != 31) {
                        xx[5] = (aa[t] + anobia[t] + 300 - fx) / 100;
                        xx[6] = (ab[t] - fy) / 100;
                    } else {
                        xx[5] = (aa[t] + anobia[t] + 300 - fx) / 100;
                        xx[6] = (ab[t] - fy - 800) / 100;
                    }

                    setc0();
                    str(xs[0], xx[5] - 1, xx[6] - 1);
                    str(xs[0], xx[5] + 1, xx[6] + 1);
                    setc1();
                    str(xs[0], xx[5], xx[6]);
                }
            }

            if (tmsgtm > 0) {
                ttmsg();
                if (tmsgtype == 1) {
                    xx[0] = 1200;
                    tmsgy += xx[0];
                    if (tmsgtm == 1) {
                        tmsgtm = 80000000;
                        tmsgtype = 2;
                    }
                } else if (tmsgtype == 2) {
                    if (key_Z || key_Space || key_Enter) {
                        tmsgtm = 16;
                        tmsgtype = 3;
                        tmsgy = 0;
                    }

                    if (key_Left || key_Up || key_Right) {
                        tmsgtm = 16;
                        tmsgtype = 3;
                        tmsgy = 0;
                    }
                } else if (tmsgtype == 3) {
                    xx[0] = 1200;
                    tmsgy += xx[0];
                    if (tmsgtm == 15) {
                        ;
                    }

                    if (tmsgtm == 1) {
                        tmsgtm = 0;
                        tmsgtype = 0;
                        tmsgy = 0;
                    }
                }

                --tmsgtm;
            }

            if (mainmsgtype >= 1) {
                setfont(20, 4);
                if (mainmsgtype == 1) {
                    setcolor(255, 255, 255);
                    str("WELCOME TO OWATA ZONEー", 126, 100);
                }

                if (mainmsgtype == 1) {
                    for (t2 = 0; t2 <= 2; ++t2) {
                        setcolor(255, 255, 255);
                        str("1", 88 + t2 * 143, 210);
                    }
                }

                setfont(20, 5);
            }

            if (blacktm > 0) {
                --blacktm;
                fillrect(0, 0, fxmax, fymax);
                if (blacktm == 0 && blackx == 1) {
                    zxon = 0;
                }
            }
        }

        if (main == 2) {
            setcolor(255, 255, 255);
            str("制作・プレイに関わった方々", 110, xx[12] / 100);
            str("ステージ１　プレイ", 150, xx[13] / 100);
            str("先輩　Ⅹ～Ｚ", 180, xx[14] / 100);
            str("ステージ２　プレイ", 150, xx[15] / 100);
            str("友人　willowlet ", 160, xx[16] / 100);
            str("ステージ３　プレイ", 150, xx[17] / 100);
            str("友人　willowlet ", 160, xx[18] / 100);
            str("ステージ４　プレイ", 150, xx[19] / 100);
            str("友人２　ann ", 180, xx[20] / 100);
            str("ご協力", 210, xx[21] / 100);
            str("Ｔ先輩", 210, xx[22] / 100);
            str("Ｓ先輩", 210, xx[23] / 100);
            str("動画技術提供", 180, xx[24] / 100);
            str("Ｋ先輩", 210, xx[25] / 100);
            str("動画キャプチャ・編集・エンコード", 80, xx[26] / 100);
            str("willowlet ", 190, xx[27] / 100);
            str("プログラム・描画・ネタ・動画編集", 80, xx[28] / 100);
            str("ちく", 220, xx[29] / 100);
            str("プレイしていただき　ありがとうございました～", 20, xx[30] / 100);
        }

        if (main == 10) {
            setc0();
            fillrect(0, 0, fxmax, fymax);
            setfont(20, 6);
            drawimage(grap[0][0], 190, 190);
            setcolor(255, 255, 255);
            h.drawString(" × " + nokori, 230, 216);
        }

        if (main == 100) {
            setcolor(160, 180, 250);
            fillrect(0, 0, fxmax, fymax);
            drawimage(mgrap[30], 50, 60);
            drawimage(grap[0][4], 360, 278);
            drawimage(grap[1][4], 180, 336);
            drawimage(grap[0][0], 60, 330);

            for (t = 0; t <= 16; ++t) {
                drawimage(grap[5][1], 29 * t, 365);
                drawimage(grap[6][1], 29 * t, 394);
            }

            setcolor(0, 0, 0);
            str("Prece Enter Key ", 160, 250);
        }

        var1.drawImage(buf, 0, 0, this);
        gflag = true;
    }

    public void keyPressed(KeyEvent var1) {
        if (var1.getKeyCode() == 90) {
            key_Z = true;
        }

        if (var1.getKeyCode() == 88) {
            key_X = true;
        }

        if (var1.getKeyCode() == 65) {
            key_A = true;
        }

        if (KeyEvent.getKeyText(var1.getKeyCode()) == "Right") {
            key_Right = true;
        }

        if (KeyEvent.getKeyText(var1.getKeyCode()) == "Left") {
            key_Left = true;
        }

        if (KeyEvent.getKeyText(var1.getKeyCode()) == "Up") {
            key_Up = true;
        }

        if (KeyEvent.getKeyText(var1.getKeyCode()) == "Down") {
            key_Down = true;
        }

        if (KeyEvent.getKeyText(var1.getKeyCode()) == "Enter") {
            key_Enter = true;
        }

        if (KeyEvent.getKeyText(var1.getKeyCode()) == "Space") {
            key_Space = true;
        }

        if (var1.getKeyCode() == 48) {
            key_0 = true;
        }

        if (var1.getKeyCode() == 49) {
            key_1 = true;
        }

        if (var1.getKeyCode() == 50) {
            key_2 = true;
        }

        if (var1.getKeyCode() == 51) {
            key_3 = true;
        }

        if (var1.getKeyCode() == 52) {
            key_4 = true;
        }

        if (var1.getKeyCode() == 79) {
            key_O = true;
        }

        if (var1.getKeyCode() == 84) {
            key_T = true;
        }

    }

    public void keyReleased(KeyEvent var1) {
        if (var1.getKeyCode() == 90) {
            key_Z = false;
        }

        if (var1.getKeyCode() == 88) {
            key_X = false;
        }

        if (var1.getKeyCode() == 65) {
            key_A = false;
        }

        if (KeyEvent.getKeyText(var1.getKeyCode()) == "Right") {
            key_Right = false;
        }

        if (KeyEvent.getKeyText(var1.getKeyCode()) == "Left") {
            key_Left = false;
        }

        if (KeyEvent.getKeyText(var1.getKeyCode()) == "Up") {
            key_Up = false;
        }

        if (KeyEvent.getKeyText(var1.getKeyCode()) == "Down") {
            key_Down = false;
        }

        if (KeyEvent.getKeyText(var1.getKeyCode()) == "Enter") {
            key_Enter = false;
        }

        if (KeyEvent.getKeyText(var1.getKeyCode()) == "Space") {
            key_Space = false;
        }

        if (var1.getKeyCode() == 48) {
            key_0 = false;
        }

        if (var1.getKeyCode() == 49) {
            key_1 = false;
        }

        if (var1.getKeyCode() == 50) {
            key_2 = false;
        }

        if (var1.getKeyCode() == 51) {
            key_3 = false;
        }

        if (var1.getKeyCode() == 52) {
            key_4 = false;
        }

        if (var1.getKeyCode() == 79) {
            key_O = false;
        }

        if (var1.getKeyCode() == 84) {
            key_T = false;
        }

    }

    public void keyTyped(KeyEvent var1) {
    }

    public void run() {
        while (true) {
            stime = System.currentTimeMillis();
            if (ending == 1) {
                main = 2;
            }

            if (main == 1 && tmsgtype == 0) {
                if (zxon == 0) {
                    zxon = 1;
                    mainmsgtype = 0;
                    stagecolor = 1;
                    ma = 5600;
                    mb = 32000;
                    mmuki = 1;
                    mhp = 1;
                    mc = 0;
                    md = 0;
                    mnobia = 3000;
                    mnobib = 3600;
                    mtype = 0;
                    fx = 0;
                    fy = 0;
                    fzx = 0;
                    stageonoff = 0;
                    bgmchange(oto[100]);
                    stagecls();
                    stage();
                    if (over == 1) {
                        for (t = 0; t < tmax; ++t) {
                            if (rand(3) <= 1) {
                                ta[t] = (rand(500) - 1) * 29 * 100;
                                tb[t] = rand(14) * 100 * 29 - 1200;
                                ttype[t] = rand(142);
                                if (ttype[t] >= 9 && ttype[t] <= 99) {
                                    ttype[t] = rand(8);
                                }

                                txtype[t] = rand(4);
                            }
                        }

                        for (t = 0; t < bmax; ++t) {
                            if (rand(2) <= 1) {
                                ba[t] = (rand(500) - 1) * 29 * 100;
                                bb[t] = rand(15) * 100 * 29 - 1200 - 3000;
                                if (rand(6) == 0) {
                                    btype[t] = rand(9);
                                }
                            }
                        }

                        srco = 0;
                        t = srco;
                        sra[t] = ma + fx;
                        srb[t] = '\u8e94';
                        src[t] = 3000;
                        srtype[t] = 0;
                        sracttype[t] = 0;
                        sre[t] = 0;
                        srsp[t] = 0;
                        ++srco;
                        if (rand(4) == 0) {
                            stagecolor = rand(4);
                        }
                    }

                    StopSoundMem(oto[0]);
                    PlaySoundMem(oto[0]);
                }

                xx[0] = 0;
                actaon[2] = 0;
                actaon[3] = 0;
                if (mkeytm <= 0) {
                    if (key_Left && keytm <= 0) {
                        actaon[0] = -1;
                        mmuki = 0;
                        actaon[4] = -1;
                    }

                    if (key_Right && keytm <= 0) {
                        actaon[0] = 1;
                        mmuki = 1;
                        actaon[4] = 1;
                    }

                    if (key_Down) {
                        actaon[3] = 1;
                    }
                }

                if (key_T) {
                    main = 100;
                }

                if (key_O) {
                    if (mhp >= 1) {
                        mhp = 0;
                    }

                    if (stc >= 5) {
                        stc = 0;
                        stagepoint = 0;
                    }
                }

                if (mkeytm <= 0 && (key_Up || key_Z)) {
                    if (actaon[1] == 10) {
                        actaon[1] = 1;
                        xx[0] = 1;
                    }

                    actaon[2] = 1;
                }

                if (key_Up || key_Z) {
                    if (mjumptm == 8 && md >= -900) {
                        md = -1300;
                        xx[22] = 200;
                        if (mc >= xx[22] || mc <= -xx[22]) {
                            md = -1400;
                        }

                        xx[22] = 600;
                        if (mc >= xx[22] || mc <= -xx[22]) {
                            md = -1500;
                        }
                    }

                    if (xx[0] == 0) {
                        actaon[1] = 10;
                    }
                }

                xx[0] = 40;
                xx[1] = 700;
                xx[8] = 500;
                xx[9] = 700;
                xx[12] = 1;
                xx[13] = 2;
                if (mrzimen == 1) {
                    xx[0] = 20;
                    xx[12] = 9;
                    xx[13] = 10;
                }

                if (actaon[0] == -1) {
                    if (mzimen != 0 || mc >= -xx[8]) {
                        if (mc >= -xx[9]) {
                            mc -= xx[0];
                            if (mc < -xx[9]) {
                                mc = -xx[9] - 1;
                            }
                        }

                        if (mc < -xx[9] && atktm <= 0) {
                            mc -= xx[0] / 10;
                        }
                    }

                    if (mrzimen != 1) {
                        if (mc > 100 && mzimen == 0) {
                            mc -= xx[0] * 2 / 3;
                        }

                        if (mc > 100 && mzimen == 1) {
                            mc -= xx[0];
                            if (mzimen == 1) {
                                mc -= xx[0] * 1 / 2;
                            }
                        }

                        actaon[0] = 3;
                        ++mkasok;
                    }
                }

                if (actaon[0] == 1) {
                    if (mzimen != 0 || mc <= xx[8]) {
                        if (mc <= xx[9]) {
                            mc += xx[0];
                            if (mc > xx[9]) {
                                mc = xx[9] + 1;
                            }
                        }

                        if (mc > xx[9] && atktm <= 0) {
                            mc += xx[0] / 10;
                        }
                    }

                    if (mrzimen != 1) {
                        if (mc < -100 && mzimen == 0) {
                            mc += xx[0] * 2 / 3;
                        }

                        if (mc < -100 && mzimen == 1) {
                            mc += xx[0];
                            if (mzimen == 1) {
                                mc += xx[0] * 1 / 2;
                            }
                        }

                        actaon[0] = 3;
                        ++mkasok;
                    }
                }

                if (actaon[0] == 0 && mkasok > 0) {
                    mkasok -= 2;
                }

                if (mkasok > 8) {
                    mkasok = 8;
                }

                if (mzimen != 1) {
                    mrzimen = 0;
                }

                if (mjumptm >= 0) {
                    --mjumptm;
                }

                if (actaon[1] == 1 && mzimen == 1) {
                    mb -= 400;
                    md = -1200;
                    mjumptm = 10;
                    ot(oto[1]);
                    mzimen = 0;
                }

                if (actaon[1] <= 9) {
                    actaon[1] = 0;
                }

                if (mmutekitm >= -1) {
                    --mmutekitm;
                }

                if (mhp <= 0 && mhp >= -9) {
                    mkeytm = 12;
                    mhp = -20;
                    mtype = 200;
                    mtm = 0;
                    ot(oto[12]);
                    StopSoundMem(oto[0]);
                    StopSoundMem(oto[11]);
                    StopSoundMem(oto[16]);
                }

                if (mtype == 200) {
                    if (mtm <= 11) {
                        mc = 0;
                        md = 0;
                    }

                    if (mtm == 12) {
                        md = -1200;
                    }

                    if (mtm >= 12) {
                        mc = 0;
                    }

                    if (mtm >= 100 || fast == 1) {
                        zxon = 0;
                        main = 10;
                        mtm = 0;
                        mkeytm = 0;
                        --nokori;
                        if (fast == 1) {
                            mtype = 0;
                        }
                    }
                }

                if (mtype == 2) {
                    ++mtm;
                    mkeytm = 2;
                    md = -1500;
                    if (mb <= -6000) {
                        blackx = 1;
                        blacktm = 20;
                        stc += 5;
                        stagerr = 0;
                        StopSoundMem(oto[0]);
                        mtm = 0;
                        mtype = 0;
                        mkeytm = -1;
                    }
                }

                if (mtype == 3) {
                    md = -2400;
                    if (mb <= -6000) {
                        mb = -80000000;
                        mhp = 0;
                    }
                }

                if (mtype >= 100) {
                    ++mtm;
                    if (mtype == 100 && (mxtype == 1 || mxtype == 2 || mxtype == 3 || mxtype == 5)) {
                        mc = 0;
                        md = 0;
                        if (mtm <= 16 && mxtype != 3) {
                            mb += 240;
                        }

                        if (mtm <= 16 && mxtype == 3) {
                            ma += 240;
                        }

                        if (mtm == 19 && mxtype == 2) {
                            mhp = 0;
                            mtype = 2000;
                            mtm = 0;
                            mmsgtm = 30;
                            mmsgtype = 51;
                        }

                        if (mtm == 19 && mxtype == 5) {
                            mhp = 0;
                            mtype = 2000;
                            mtm = 0;
                            mmsgtm = 30;
                            mmsgtype = 52;
                        }

                        if (mtm == 20) {
                            mb = -80000000;
                            mxtype = 0;
                            blackx = 1;
                            blacktm = 20;
                            ++stc;
                            stagerr = 0;
                            StopSoundMem(oto[0]);
                        }
                    }

                    if (mtype == 100 && mxtype == 0) {
                        mc = 0;
                        md = 0;
                        t = 28;
                        if (mtm <= 16) {
                            mb += 240;
                            mzz = 100;
                        }

                        if (mtm == 17) {
                            mb = -80000000;
                        }

                        if (mtm == 23) {
                            sa[t] -= 100;
                        }

                        if (mtm >= 44 && mtm <= 60) {
                            if (mtm % 2 == 0) {
                                sa[t] += 200;
                            }

                            if (mtm % 2 == 1) {
                                sa[t] -= 200;
                            }
                        }

                        if (mtm >= 61 && mtm <= 77) {
                            if (mtm % 2 == 0) {
                                sa[t] += 400;
                            }

                            if (mtm % 2 == 1) {
                                sa[t] -= 400;
                            }
                        }

                        if (mtm >= 78 && mtm <= 94) {
                            if (mtm % 2 == 0) {
                                sa[t] += 600;
                            }

                            if (mtm % 2 == 1) {
                                sa[t] -= 600;
                            }
                        }

                        if (mtm >= 110) {
                            sb[t] -= mzz;
                            mzz += 80;
                            if (mzz > 1600) {
                                mzz = 1600;
                            }
                        }

                        if (mtm == 160) {
                            mtype = 0;
                            --mhp;
                        }
                    }

                    if (mtype == 100 && mxtype == 10) {
                        mc = 0;
                        md = 0;
                        if (mtm <= 16) {
                            ma += 240;
                        }

                        if (mtm == 16) {
                            mb -= 1100;
                        }

                        if (mtm == 20) {
                            ot(oto[10]);
                        }

                        if (mtm >= 24) {
                            ma -= 2000;
                            mmuki = 0;
                        }

                        if (mtm >= 48) {
                            mtype = 0;
                            --mhp;
                        }
                    }

                    if (mtype == 300) {
                        mkeytm = 3;
                        if (mtm <= 1) {
                            mc = 0;
                            md = 0;
                        }

                        if (mtm >= 2 && mtm <= 42) {
                            md = 600;
                            mmuki = 1;
                        }

                        if (mtm > 43 && mtm <= 108) {
                            mc = 300;
                        }

                        if (mtm == 110) {
                            mb = -80000000;
                            mc = 0;
                        }

                        if (mtm == 250) {
                            ++stb;
                            stc = 0;
                            zxon = 0;
                            tyuukan = 0;
                            main = 10;
                            maintm = 0;
                        }
                    }

                    if (mtype == 301 || mtype == 302) {
                        mkeytm = 3;
                        if (mtm <= 1) {
                            mc = 0;
                            md = 0;
                        }

                        if (mtm >= 2 && (mtype == 301 && mtm <= 102 || mtype == 302 && mtm <= 60)) {
                            xx[5] = 500;
                            ma -= xx[5];
                            fx += xx[5];
                            fzx += xx[5];
                        }

                        if (mtype == 301 || mtype == 302 && mtm >= 2 && mtm <= 100) {
                            mc = 250;
                            mmuki = 1;
                        }

                        if (mtm == 200) {
                            ot(oto[17]);
                            na[nco] = 454200;
                            nb[nco] = 11600;
                            ntype[nco] = 101;
                            ++nco;
                            if (nco >= nmax) {
                                nco = 0;
                            }

                            na[nco] = 448400;
                            nb[nco] = 17400;
                            ntype[nco] = 102;
                            ++nco;
                            if (nco >= nmax) {
                                nco = 0;
                            }
                        }

                        if (mtm == 440) {
                            ending = 1;
                        }
                    }
                }

                if (mkeytm >= 1) {
                    --mkeytm;
                }

                ma += mc;
                mb += md;
                if (mc < 0) {
                    mactp += -mc;
                }

                if (mc >= 0) {
                    mactp += mc;
                }

                if (mtype <= 9 || mtype == 200 || mtype == 300 || mtype == 301 || mtype == 302) {
                    md += 100;
                }

                if (mtype == 0) {
                    xx[0] = 800;
                    xx[1] = 1600;
                    if (mc > xx[0] && mc < xx[0] + 200) {
                        mc = xx[0];
                    }

                    if (mc > xx[0] + 200) {
                        mc -= 200;
                    }

                    if (mc < -xx[0] && mc > -xx[0] - 200) {
                        mc = -xx[0];
                    }

                    if (mc < -xx[0] - 200) {
                        mc += 200;
                    }

                    if (md > xx[1]) {
                        md = xx[1];
                    }
                }

                if (mzimen == 1 && actaon[0] != 3 && (mtype <= 9 || mtype == 300 || mtype == 301 || mtype == 302)) {
                    if (mrzimen == 0) {
                        xx[2] = 30;
                        xx[1] = 60;
                        xx[3] = 30;
                        if (mc >= -xx[3] && mc <= xx[3]) {
                            mc = 0;
                        }

                        if (mc >= xx[2]) {
                            mc -= xx[1];
                        }

                        if (mc <= -xx[2]) {
                            mc += xx[1];
                        }
                    }

                    if (mrzimen == 1) {
                        xx[2] = 5;
                        xx[1] = 10;
                        xx[3] = 5;
                        if (mc >= -xx[3] && mc <= xx[3]) {
                            mc = 0;
                        }

                        if (mc >= xx[2]) {
                            mc -= xx[1];
                        }

                        if (mc <= -xx[2]) {
                            mc += xx[1];
                        }
                    }
                }

                mzimen = 0;
                if (mtype <= 9 && mhp >= 1) {
                    if (ma < 100) {
                        ma = 100;
                        mc = 0;
                    }

                    if (ma + mnobia > fxmax) {
                        ma = fxmax - mnobia;
                        mc = 0;
                    }
                }

                if (mb >= '\u9470' && mhp >= 0 && stagecolor == 4) {
                    mhp = -2;
                    mmsgtm = 30;
                    mmsgtype = 55;
                }

                if (mb >= '\ucb20' && mhp >= 0) {
                    mhp = -2;
                }

                xx[15] = 0;

                for (t = 0; t < tmax; ++t) {
                    xx[0] = 200;
                    xx[1] = 3000;
                    xx[2] = 1000;
                    xx[3] = 3000;
                    xx[8] = ta[t] - fx;
                    xx[9] = tb[t] - fy;
                    if (ta[t] - fx + xx[1] >= -10 - xx[3] && ta[t] - fx <= fxmax + 12000 + xx[3]) {
                        if (mtype != 200 && mtype != 1 && mtype != 2) {
                            if (ttype[t] < 1000 && ttype[t] != 800 && ttype[t] != 140 && ttype[t] != 141) {
                                if (mztype != 1) {
                                    xx[16] = 0;
                                    xx[17] = 0;
                                    if (ttype[t] != 7 && ttype[t] != 110 && ttype[t] != 114 && ma + mnobia > xx[8] + xx[0] * 2 + 100 && ma < xx[8] + xx[1] - xx[0] * 2 - 100 && mb + mnobib > xx[9] && mb + mnobib < xx[9] + xx[1] && md >= -100) {
                                        if (ttype[t] != 115 && ttype[t] != 400 && ttype[t] != 117 && ttype[t] != 118 && ttype[t] != 120) {
                                            mb = xx[9] - mnobib + 100;
                                            md = 0;
                                            mzimen = 1;
                                            xx[16] = 1;
                                        } else if (ttype[t] == 115) {
                                            ot(oto[3]);
                                            eyobi(ta[t] + 1200, tb[t] + 1200, 300, -1000, 0, 160, 1000, 1000, 1, 120);
                                            eyobi(ta[t] + 1200, tb[t] + 1200, -300, -1000, 0, 160, 1000, 1000, 1, 120);
                                            eyobi(ta[t] + 1200, tb[t] + 1200, 240, -1400, 0, 160, 1000, 1000, 1, 120);
                                            eyobi(ta[t] + 1200, tb[t] + 1200, -240, -1400, 0, 160, 1000, 1000, 1, 120);
                                            brockbreak(t);
                                        } else if (ttype[t] == 400) {
                                            md = 0;
                                            ta[t] = -8000000;
                                            ot(oto[13]);

                                            for (tt = 0; tt < tmax; ++tt) {
                                                if (ttype[tt] != 7) {
                                                    ttype[tt] = 800;
                                                }
                                            }

                                            StopSoundMem(oto[0]);
                                        } else if (ttype[t] == 117) {
                                            ot(oto[14]);
                                            md = -1500;
                                            mtype = 2;
                                            mtm = 0;
                                            if (txtype[t] >= 2 && mtype == 2) {
                                                mtype = 0;
                                                md = -1600;
                                                txtype[t] = 3;
                                            }

                                            if (txtype[t] == 0) {
                                                txtype[t] = 1;
                                            }
                                        } else if (ttype[t] == 120) {
                                            md = -2400;
                                            mtype = 3;
                                            mtm = 0;
                                        }
                                    }
                                }

                                if (mztm < 1 || mztype != 1) {
                                    xx[21] = 0;
                                    xx[22] = 1;
                                    if (mzimen == 1 || mjumptm >= 10) {
                                        xx[21] = 3;
                                        xx[22] = 0;
                                    }

                                    for (t3 = 0; t3 <= 1; ++t3) {
                                        if (t3 == xx[21] && mtype != 100 && ttype[t] != 117 && ma + mnobia > xx[8] + xx[0] * 2 + 800 && ma < xx[8] + xx[1] - xx[0] * 2 - 800 && mb > xx[9] - xx[0] * 2 && mb < xx[9] + xx[1] - xx[0] * 2 && md <= 0) {
                                            xx[16] = 1;
                                            xx[17] = 1;
                                            mb = xx[9] + xx[1] + xx[0];
                                            if (md < 0) {
                                                md = -md * 2 / 3;
                                            }

                                            if (ttype[t] == 1 && mzimen == 0) {
                                                ot(oto[3]);
                                                eyobi(ta[t] + 1200, tb[t] + 1200, 300, -1000, 0, 160, 1000, 1000, 1, 120);
                                                eyobi(ta[t] + 1200, tb[t] + 1200, -300, -1000, 0, 160, 1000, 1000, 1, 120);
                                                eyobi(ta[t] + 1200, tb[t] + 1200, 240, -1400, 0, 160, 1000, 1000, 1, 120);
                                                eyobi(ta[t] + 1200, tb[t] + 1200, -240, -1400, 0, 160, 1000, 1000, 1, 120);
                                                brockbreak(t);
                                            }

                                            if (ttype[t] == 2 && mzimen == 0) {
                                                ot(oto[4]);
                                                eyobi(ta[t] + 10, tb[t], 0, -800, 0, 40, 3000, 3000, 0, 16);
                                                ttype[t] = 3;
                                            }

                                            if (ttype[t] == 7) {
                                                ot(oto[4]);
                                                eyobi(ta[t] + 10, tb[t], 0, -800, 0, 40, 3000, 3000, 0, 16);
                                                mb = xx[9] + xx[1] + xx[0];
                                                ttype[t] = 3;
                                                if (md < 0) {
                                                    md = -md * 2 / 3;
                                                }
                                            }
                                        }

                                        if (t3 == xx[22] && xx[15] == 0 && ttype[t] != 7 && ttype[t] != 110 && ttype[t] != 117 && ttype[t] != 114 && ta[t] >= -20000) {
                                            if (ma + mnobia > xx[8] && ma < xx[8] + xx[2] && mb + mnobib > xx[9] + xx[1] / 2 - xx[0] && mb < xx[9] + xx[2] && mc >= 0) {
                                                ma = xx[8] - mnobia;
                                                mc = 0;
                                                xx[16] = 1;
                                            }

                                            if (ma + mnobia > xx[8] + xx[2] && ma < xx[8] + xx[1] && mb + mnobib > xx[9] + xx[1] / 2 - xx[0] && mb < xx[9] + xx[2] && mc <= 0) {
                                                ma = xx[8] + xx[1];
                                                mc = 0;
                                                xx[16] = 1;
                                            }
                                        }
                                    }
                                }
                            }

                            if (ttype[t] == 800 && mb > xx[9] - xx[0] * 2 - 2000 && mb < xx[9] + xx[1] - xx[0] * 2 + 2000 && ma + mnobia > xx[8] - 400 && ma < xx[8] + xx[1]) {
                                ta[t] = -800000;
                                ot(oto[4]);
                            }

                            if (ttype[t] == 140 && mb > xx[9] - xx[0] * 2 - 2000 && mb < xx[9] + xx[1] - xx[0] * 2 + 2000 && ma + mnobia > xx[8] - 400 && ma < xx[8] + xx[1]) {
                                ta[t] = -800000;
                                sracttype[20] = 1;
                                sron[20] = 1;
                                StopSoundMem(oto[0]);
                                mtype = 301;
                                mtm = 0;
                                ot(oto[16]);
                            }

                            if (ttype[t] == 100) {
                                if (mb > xx[9] - xx[0] * 2 - 2000 && mb < xx[9] + xx[1] - xx[0] * 2 + 2000 && ma + mnobia > xx[8] - 400 && ma < xx[8] + xx[1] && md <= 0 && txtype[t] == 0) {
                                    tb[t] = mb + fy - 1200 - xx[1];
                                }

                                if (txtype[t] == 1 && xx[17] == 1) {
                                    if (ma + mnobia > xx[8] - 400 && ma < xx[8] + xx[1] / 2 - 1500) {
                                        ta[t] += 3000;
                                    } else if (ma + mnobia >= xx[8] + xx[1] / 2 - 1500 && ma < xx[8] + xx[1]) {
                                        ta[t] -= 3000;
                                    }
                                }

                                if (xx[17] == 1 && txtype[t] == 0) {
                                    ot(oto[4]);
                                    eyobi(ta[t] + 10, tb[t], 0, -800, 0, 40, 3000, 3000, 0, 16);
                                    ttype[t] = 3;
                                }
                            }

                            if (ttype[t] == 101 && xx[17] == 1) {
                                ot(oto[8]);
                                ttype[t] = 3;
                                abrocktm[aco] = 16;
                                if (txtype[t] == 0) {
                                    ayobi(ta[t], tb[t], 0, 0, 0, 0, 0);
                                }

                                if (txtype[t] == 1) {
                                    ayobi(ta[t], tb[t], 0, 0, 0, 4, 0);
                                }

                                if (txtype[t] == 3) {
                                    ayobi(ta[t], tb[t], 0, 0, 0, 101, 0);
                                }

                                if (txtype[t] == 4) {
                                    abrocktm[aco] = 20;
                                    ayobi(ta[t] - 400, tb[t] - 1600, 0, 0, 0, 6, 0);
                                }
                            }

                            if (ttype[t] == 102 && xx[17] == 1) {
                                ot(oto[8]);
                                ttype[t] = 3;
                                abrocktm[aco] = 16;
                                if (txtype[t] == 0) {
                                    ayobi(ta[t], tb[t], 0, 0, 0, 100, 0);
                                }

                                if (txtype[t] == 2) {
                                    ayobi(ta[t], tb[t], 0, 0, 0, 100, 2);
                                }

                                if (txtype[t] == 3) {
                                    ayobi(ta[t], tb[t], 0, 0, 0, 102, 1);
                                }
                            }

                            if (ttype[t] == 103 && xx[17] == 1) {
                                ot(oto[8]);
                                ttype[t] = 3;
                                abrocktm[aco] = 16;
                                ayobi(ta[t], tb[t], 0, 0, 0, 100, 1);
                            }

                            if (ttype[t] == 104 && xx[17] == 1) {
                                ot(oto[8]);
                                ttype[t] = 3;
                                abrocktm[aco] = 16;
                                ayobi(ta[t], tb[t], 0, 0, 0, 110, 0);
                            }

                            if (ttype[t] == 110 && xx[17] == 1) {
                                ttype[t] = 111;
                                thp[t] = 999;
                            }

                            if (ttype[t] == 111 && ta[t] - fx >= 0) {
                                ++thp[t];
                                if (thp[t] >= 16) {
                                    thp[t] = 0;
                                    ot(oto[8]);
                                    abrocktm[aco] = 16;
                                    ayobi(ta[t], tb[t], 0, 0, 0, 102, 1);
                                }
                            }

                            if (ttype[t] == 112 && xx[17] == 1) {
                                ttype[t] = 113;
                                thp[t] = 999;
                                titem[t] = 0;
                            }

                            if (ttype[t] == 113 && ta[t] - fx >= 0) {
                                if (titem[t] <= 19) {
                                    ++thp[t];
                                }

                                if (thp[t] >= 3) {
                                    thp[t] = 0;
                                    ++titem[t];
                                    ot(oto[4]);
                                    eyobi(ta[t] + 10, tb[t], 0, -800, 0, 40, 3000, 3000, 0, 16);
                                }
                            }

                            if (ttype[t] == 114 && xx[17] == 1) {
                                if (txtype[t] == 0) {
                                    ot(oto[8]);
                                    ttype[t] = 3;
                                    abrocktm[aco] = 16;
                                    ayobi(ta[t], tb[t], 0, 0, 0, 102, 1);
                                }

                                if (txtype[t] == 2) {
                                    ot(oto[4]);
                                    eyobi(ta[t] + 10, tb[t], 0, -800, 0, 40, 3000, 3000, 0, 16);
                                    ttype[t] = 115;
                                    txtype[t] = 0;
                                }

                                if (txtype[t] == 10) {
                                    if (stageonoff == 1) {
                                        ttype[t] = 130;
                                        stageonoff = 0;
                                        ot(oto[13]);
                                        txtype[t] = 2;

                                        for (t = 0; t < amax; ++t) {
                                            if (atype[t] == 87 && axtype[t] == 105) {
                                                axtype[t] = 110;
                                            }
                                        }
                                    } else {
                                        ot(oto[4]);
                                        eyobi(ta[t] + 10, tb[t], 0, -800, 0, 40, 3000, 3000, 0, 16);
                                        ttype[t] = 3;
                                    }
                                }
                            }

                            if (ttype[t] == 115) {
                                ;
                            }

                            if (ttype[t] == 116 && xx[17] == 1) {
                                ot(oto[8]);
                                ttype[t] = 3;
                                tyobi(ta[t] / 100, tb[t] / 100 - 29, 400);
                            }

                            if (ttype[t] == 124 && xx[17] == 1) {
                                ot(oto[13]);

                                for (t = 0; t < amax; ++t) {
                                    if (atype[t] == 87 && axtype[t] == 101) {
                                        axtype[t] = 120;
                                    }
                                }

                                ttype[t] = 3;
                            }

                            if (ttype[t] == 130) {
                                if (xx[17] == 1 && txtype[t] != 1) {
                                    stageonoff = 0;
                                    ot(oto[13]);
                                }
                            } else if (ttype[t] == 131 && xx[17] == 1 && txtype[t] != 2) {
                                stageonoff = 1;
                                ot(oto[13]);
                                if (txtype[t] == 1) {
                                    for (t = 0; t < amax; ++t) {
                                        if (atype[t] == 87 && axtype[t] == 105) {
                                            axtype[t] = 110;
                                        }
                                    }

                                    bxtype[3] = 105;
                                }
                            }

                            if (ttype[t] == 300 && xx[17] == 1) {
                                ot(oto[15]);
                                if (txtype[t] <= 100) {
                                    tmsgtype = 1;
                                    tmsgtm = 15;
                                    tmsgy = 300 + (txtype[t] - 1);
                                    tmsg = txtype[t];
                                }

                                if (txtype[t] == 540) {
                                    tmsgtype = 1;
                                    tmsgtm = 15;
                                    tmsgy = 400;
                                    tmsg = 100;
                                    txtype[t] = 541;
                                }
                            }

                            if (ttype[t] == 301 && xx[17] == 1) {
                                ot(oto[3]);
                                eyobi(ta[t] + 1200, tb[t] + 1200, 300, -1000, 0, 160, 1000, 1000, 1, 120);
                                eyobi(ta[t] + 1200, tb[t] + 1200, -300, -1000, 0, 160, 1000, 1000, 1, 120);
                                eyobi(ta[t] + 1200, tb[t] + 1200, 240, -1400, 0, 160, 1000, 1000, 1, 120);
                                eyobi(ta[t] + 1200, tb[t] + 1200, -240, -1400, 0, 160, 1000, 1000, 1, 120);
                                brockbreak(t);
                            }
                        } else if (mtype == 1 && ma + mnobia > xx[8] && ma < xx[8] + xx[1] && mb + mnobib > xx[9] && mb < xx[9] + xx[1]) {
                            ot(oto[3]);
                            eyobi(ta[t] + 1200, tb[t] + 1200, 300, -1000, 0, 160, 1000, 1000, 1, 120);
                            eyobi(ta[t] + 1200, tb[t] + 1200, -300, -1000, 0, 160, 1000, 1000, 1, 120);
                            eyobi(ta[t] + 1200, tb[t] + 1200, 240, -1400, 0, 160, 1000, 1000, 1, 120);
                            eyobi(ta[t] + 1200, tb[t] + 1200, -240, -1400, 0, 160, 1000, 1000, 1, 120);
                            brockbreak(t);
                        }

                        if (ttype[t] == 130 && stageonoff == 0) {
                            ttype[t] = 131;
                        }

                        if (ttype[t] == 131 && stageonoff == 1) {
                            ttype[t] = 130;
                        }

                        if (ttype[t] == 300 && txtype[t] >= 500 && ta[t] >= -6000) {
                            if (txtype[t] <= 539) {
                                ++txtype[t];
                            }

                            if (txtype[t] >= 540) {
                                ta[t] -= 500;
                            }
                        }
                    }
                }

                for (t = 0; t < smax; ++t) {
                    if (sa[t] - fx + sc[t] >= -12000 && sa[t] - fx <= fxmax) {
                        xx[0] = 200;
                        xx[1] = 2400;
                        xx[2] = 1000;
                        xx[7] = 0;
                        xx[8] = sa[t] - fx;
                        xx[9] = sb[t] - fy;
                        if ((stype[t] <= 99 || stype[t] == 200) && mtype < 10) {
                            if (stype[t] == 51) {
                                if (ma + mnobia > xx[8] + xx[0] + 3000 && ma < xx[8] + sc[t] - xx[0] && mb + mnobib > xx[9] + 3000 && sgtype[t] == 0 && sxtype[t] == 0) {
                                    sgtype[t] = 1;
                                    sr[t] = 0;
                                }

                                if (ma + mnobia > xx[8] + xx[0] + 1000 && ma < xx[8] + sc[t] - xx[0] && mb + mnobib > xx[9] + 3000 && sgtype[t] == 0 && sxtype[t] == 10 && sgtype[t] == 0) {
                                    sgtype[t] = 1;
                                    sr[t] = 0;
                                }

                                if (sxtype[t] == 1 && sb[27] >= 25000 && sa[27] > ma + mnobia && t != 27 && sgtype[t] == 0) {
                                    sgtype[t] = 1;
                                    sr[t] = 0;
                                }

                                if (sxtype[t] == 2 && sb[28] >= '\ubb80' && t != 28 && sgtype[t] == 0 && mhp >= 1) {
                                    sgtype[t] = 1;
                                    sr[t] = 0;
                                }

                                if ((sxtype[t] == 3 && mb >= 30000 || sxtype[t] == 4 && mb >= 25000) && sgtype[t] == 0 && mhp >= 1 && ma + mnobia > xx[8] + xx[0] + 3000 - 300 && ma < xx[8] + sc[t] - xx[0]) {
                                    sgtype[t] = 1;
                                    sr[t] = 0;
                                    if (sxtype[t] == 4) {
                                        sr[t] = 100;
                                    }
                                }

                                if (sgtype[t] == 1 && sb[t] <= fymax + 18000) {
                                    sr[t] += 120;
                                    if (sr[t] >= 1600) {
                                        sr[t] = 1600;
                                    }

                                    sb[t] += sr[t];
                                    if (ma + mnobia > xx[8] + xx[0] && ma < xx[8] + sc[t] - xx[0] && mb + mnobib > xx[9] && mb < xx[9] + sd[t] + xx[0]) {
                                        --mhp;
                                        xx[7] = 1;
                                    }
                                }
                            }

                            if (stype[t] == 52) {
                                if (sgtype[t] == 0 && ma + mnobia > xx[8] + xx[0] + 2000 && ma < xx[8] + sc[t] - xx[0] - 2500 && mb + mnobib > xx[9] - 3000) {
                                    sgtype[t] = 1;
                                    sr[t] = 0;
                                }

                                if (sgtype[t] == 1) {
                                    sr[t] += 120;
                                    if (sr[t] >= 1600) {
                                        sr[t] = 1600;
                                    }

                                    sb[t] += sr[t];
                                }
                            }

                            if (xx[7] == 0) {
                                if (ma + mnobia > xx[8] + xx[0] && ma < xx[8] + sc[t] - xx[0] && mb + mnobib > xx[9] && mb + mnobib < xx[9] + xx[1] && md >= -100) {
                                    mb = sb[t] - fy - mnobib + 100;
                                    md = 0;
                                    mzimen = 1;
                                }

                                if (ma + mnobia > xx[8] - xx[0] && ma < xx[8] + xx[2] && mb + mnobib > xx[9] + xx[1] * 3 / 4 && mb < xx[9] + sd[t] - xx[2]) {
                                    ma = xx[8] - xx[0] - mnobia;
                                    mc = 0;
                                }

                                if (ma + mnobia > xx[8] + sc[t] - xx[0] && ma < xx[8] + sc[t] + xx[0] && mb + mnobib > xx[9] + xx[1] * 3 / 4 && mb < xx[9] + sd[t] - xx[2]) {
                                    ma = xx[8] + sc[t] + xx[0];
                                    mc = 0;
                                }

                                if (ma + mnobia > xx[8] + xx[0] * 2 && ma < xx[8] + sc[t] - xx[0] * 2 && mb > xx[9] + sd[t] - xx[1] && mb < xx[9] + sd[t] + xx[0]) {
                                    mb = xx[9] + sd[t] + xx[0];
                                    if (md < 0) {
                                        md = -md * 2 / 3;
                                    }
                                }
                            }

                            if (stype[t] == 50 && ma + mnobia > xx[8] + 2800 && ma < xx[8] + sc[t] - 3000 && mb + mnobib > xx[9] - 1000 && mb + mnobib < xx[9] + xx[1] + 3000 && mzimen == 1 && actaon[3] == 1 && mtype == 0) {
                                if (sxtype[t] == 0) {
                                    mtype = 100;
                                    mtm = 0;
                                    ot(oto[7]);
                                    mxtype = 0;
                                }

                                if (sxtype[t] == 1) {
                                    mtype = 100;
                                    mtm = 0;
                                    ot(oto[7]);
                                    mxtype = 1;
                                }

                                if (sxtype[t] == 2) {
                                    mtype = 100;
                                    mtm = 0;
                                    ot(oto[7]);
                                    mxtype = 2;
                                }

                                if (sxtype[t] == 5) {
                                    mtype = 100;
                                    mtm = 0;
                                    ot(oto[7]);
                                    mxtype = 5;
                                }
                            }

                            if (stype[t] == 40 && ma + mnobia > xx[8] - 300 && ma < xx[8] + sc[t] - 1000 && mb > xx[9] + 1000 && mb + mnobib < xx[9] + xx[1] + 4000 && mzimen == 1 && actaon[4] == 1 && mtype == 0) {
                                if (sxtype[t] == 0) {
                                    mtype = 500;
                                    mtm = 0;
                                    ot(oto[7]);
                                    mtype = 100;
                                    mxtype = 10;
                                }

                                if (sxtype[t] == 2) {
                                    mxtype = 3;
                                    mtm = 0;
                                    ot(oto[7]);
                                    mtype = 100;
                                }
                            }
                        } else {
                            if (ma + mnobia > xx[8] + xx[0] && ma < xx[8] + sc[t] - xx[0] && mb + mnobib > xx[9] && mb < xx[9] + sd[t] + xx[0]) {
                                if (stype[t] == 100 && (sxtype[t] == 0 || sxtype[t] == 1 && ttype[1] != 3)) {
                                    ayobi(sa[t] + 1000, 32000, 0, 0, 0, 3, 0);
                                    sa[t] = -800000000;
                                    ot(oto[10]);
                                }

                                if (stype[t] == 101) {
                                    ayobi(sa[t] + 6000, -4000, 0, 0, 0, 3, 1);
                                    sa[t] = -800000000;
                                    ot(oto[10]);
                                }

                                if (stype[t] == 102) {
                                    if (sxtype[t] == 0) {
                                        for (t3 = 0; t3 <= 3; ++t3) {
                                            ayobi(sa[t] + t3 * 3000, -3000, 0, 0, 0, 0, 0);
                                        }
                                    }

                                    if (sxtype[t] == 1 && mb >= 16000) {
                                        ayobi(sa[t] + 1500, '\uabe0', 0, -2000, 0, 4, 0);
                                    } else if (sxtype[t] == 2) {
                                        ayobi(sa[t] + 4500, 30000, 0, -1600, 0, 5, 0);
                                        ot(oto[10]);
                                        sxtype[t] = 3;
                                        sa[t] -= 12000;
                                    } else if (sxtype[t] == 3) {
                                        sa[t] += 12000;
                                        sxtype[t] = 4;
                                    } else if (sxtype[t] == 4) {
                                        ayobi(sa[t] + 4500, 30000, 0, -1600, 0, 5, 0);
                                        ot(oto[10]);
                                        sxtype[t] = 5;
                                        sxtype[t] = 0;
                                    } else if (sxtype[t] == 7) {
                                        mainmsgtype = 1;
                                    } else if (sxtype[t] == 8) {
                                        ayobi(sa[t] - 5000 - 3000, 26000, 0, -1600, 0, 5, 0);
                                        ot(oto[10]);
                                    } else if (sxtype[t] == 9) {
                                        for (t3 = 0; t3 <= 2; ++t3) {
                                            ayobi(sa[t] + t3 * 3000 + 3000, '\ubb80', 0, -6000, 0, 3, 0);
                                        }
                                    }

                                    if (sxtype[t] == 10) {
                                        sa[t] -= 15000;
                                        stype[t] = 101;
                                    }

                                    if (sxtype[t] == 12) {
                                        for (t3 = 1; t3 <= 3; ++t3) {
                                            ayobi(sa[t] + t3 * 3000 - 1000, '\u9c40', 0, -2600, 0, 9, 0);
                                        }
                                    }

                                    if (sxtype[t] == 20) {
                                        scrollx = 0;
                                    }

                                    if (sxtype[t] == 30) {
                                        sa[t] = -80000000;
                                        md = 0;
                                        StopSoundMem(oto[0]);
                                        mtype = 302;
                                        mtm = 0;
                                        ot(oto[16]);
                                    }

                                    if (sxtype[t] != 3 && sxtype[t] != 4 && sxtype[t] != 10) {
                                        sa[t] = -800000000;
                                    }
                                }

                                if (stype[t] == 103) {
                                    if (sxtype[t] == 0) {
                                        amsgtm[aco] = 10;
                                        amsgtype[aco] = 50;
                                        ayobi(sa[t] + 9000, sb[t] + 2000, 0, 0, 0, 79, 0);
                                        sa[t] = -800000000;
                                    }

                                    if (sxtype[t] == 1 && ttype[6] <= 6) {
                                        amsgtm[aco] = 10;
                                        amsgtype[aco] = 50;
                                        ayobi(sa[t] - 12000, sb[t] + 2000, 0, 0, 0, 79, 0);
                                        sa[t] = -800000000;
                                        txtype[9] = 500;
                                    }
                                }

                                if (stype[t] == 104 && sxtype[t] == 0) {
                                    ayobi(sa[t] + 12000, sb[t] + 2000 + 3000, 0, 0, 0, 79, 0);
                                    ayobi(sa[t] + 12000, sb[t] + 2000 + 3000, 0, 0, 0, 79, 1);
                                    ayobi(sa[t] + 12000, sb[t] + 2000 + 3000, 0, 0, 0, 79, 2);
                                    ayobi(sa[t] + 12000, sb[t] + 2000 + 3000, 0, 0, 0, 79, 3);
                                    ayobi(sa[t] + 12000, sb[t] + 2000 + 3000, 0, 0, 0, 79, 4);
                                    sa[t] = -800000000;
                                }

                                if (stype[t] == 105 && mzimen == 0 && md >= 0) {
                                    ta[1] -= 1000;
                                    ta[2] += 1000;
                                    ++sxtype[t];
                                    if (sxtype[t] >= 3) {
                                        sa[t] = -8000000;
                                    }
                                }

                                if (stype[t] == 300 && mtype == 0 && mb < xx[9] + sd[t] + xx[0] - 3000 && mhp >= 1) {
                                    StopSoundMem(oto[0]);
                                    mtype = 300;
                                    mtm = 0;
                                    ma = sa[t] - fx - 2000;
                                    ot(oto[11]);
                                }

                                if (stype[t] == 500 && mtype == 0 && mhp >= 1) {
                                    ++tyuukan;
                                    sa[t] = -80000000;
                                }
                            }

                            if (stype[t] == 180) {
                                ++sr[t];
                                if (sr[t] >= sgtype[t]) {
                                    sr[t] = 0;
                                    ayobi(sa[t], 30000, rand(600) - 300, -1600 - rand(900), 0, 84, 0);
                                }
                            }
                        }
                    }
                }

                actaon[0] = 0;
                actaon[4] = 0;

                for (t = 0; t < srmax; ++t) {
                    xx[10] = sra[t];
                    xx[11] = srb[t];
                    xx[12] = src[t];
                    xx[13] = srd[t];
                    xx[8] = xx[10] - fx;
                    xx[9] = xx[11] - fy;
                    if (xx[8] + xx[12] >= -12010 && xx[8] <= fxmax + 12100) {
                        xx[0] = 500;
                        xx[1] = 1200;
                        xx[2] = 1000;
                        xx[7] = 2000;
                        if (md >= 100) {
                            xx[1] = 900 + md;
                        }

                        if (md > xx[1]) {
                            xx[1] = md + 100;
                        }

                        srb[t] += sre[t];
                        sre[t] += srf[t];
                        switch (sracttype[t]) {
                            case 1:
                                if (sron[t] == 1) {
                                    srf[t] = 60;
                                }
                            case 2:
                            case 3:
                            case 4:
                            case 7:
                            default:
                                break;
                            case 5:
                                if (srmove[t] == 0) {
                                    srmuki[t] = 0;
                                } else {
                                    srmuki[t] = 1;
                                }

                                if (srb[t] - fy < -2100) {
                                    srb[t] = fymax + fy + scrolly + 2000;
                                }

                                if (srb[t] - fy > fymax + scrolly + 2000) {
                                    srb[t] = -2100 + fy;
                                }
                                break;
                            case 6:
                                if (sron[t] == 1) {
                                    srf[t] = 40;
                                }
                        }

                        if ((mztm < 1 || mztype != 1 || actaon[3] != 1) && mhp >= 1) {
                            if (ma + mnobia > xx[8] + xx[0] && ma < xx[8] + xx[12] - xx[0] && mb + mnobib > xx[9] && mb + mnobib < xx[9] + xx[1] && md >= -100) {
                                mb = xx[9] - mnobib + 100;
                                if (srtype[t] == 1) {
                                    sre[10] = 900;
                                    sre[11] = 900;
                                }

                                if (srsp[t] != 12) {
                                    mzimen = 1;
                                    md = 0;
                                } else {
                                    md = -800;
                                }

                                if (sracttype[t] == 1 && sron[t] == 0) {
                                    sron[t] = 1;
                                }

                                if (sracttype[t] == 1 && sron[t] == 1 || sracttype[t] == 3 || sracttype[t] == 5) {
                                    mb += sre[t];
                                }

                                if (sracttype[t] == 7) {
                                    if (actaon[2] != 1) {
                                        md = -600;
                                        mb -= 810;
                                    }

                                    if (actaon[2] == 1) {
                                        mb -= 400;
                                        md = -1400;
                                        mjumptm = 10;
                                    }
                                }

                                if (srsp[t] == 1) {
                                    ot(oto[3]);
                                    eyobi(sra[t] + 200, srb[t] - 1000, -240, -1400, 0, 160, 4500, 4500, 2, 120);
                                    eyobi(sra[t] + 4500 - 200, srb[t] - 1000, 240, -1400, 0, 160, 4500, 4500, 3, 120);
                                    sra[t] = -70000000;
                                }

                                if (srsp[t] == 2) {
                                    mc = -2400;
                                    ++srmove[t];
                                    if (srmove[t] >= 100) {
                                        mhp = 0;
                                        mmsgtype = 53;
                                        mmsgtm = 30;
                                        srmove[t] = -5000;
                                    }
                                }
                            }

                            if (srsp[t] == 2 && mc != -2400 && srmove[t] > 0) {
                                --srmove[t];
                            }

                            if (srsp[t] == 11) {
                                if (ma + mnobia > xx[8] + xx[0] - 2000 && ma < xx[8] + xx[12] - xx[0]) {
                                    sron[t] = 1;
                                }

                                if (sron[t] == 1) {
                                    srf[t] = 60;
                                    srb[t] += sre[t];
                                }
                            }

                            if (ma + mnobia > xx[8] + xx[0] && ma < xx[8] + xx[12] - xx[0] && mb > xx[9] - xx[1] / 2 && mb < xx[9] + xx[1] / 2 && srtype[t] == 2) {
                                if (md < 0) {
                                    md = -md;
                                }

                                mb += 110;
                                if (mmutekitm <= 0) {
                                    --mhp;
                                }

                                if (mmutekion != 1) {
                                    mmutekitm = 40;
                                }
                            }

                            if (sracttype[t] == 6 && ma + mnobia > xx[8] + xx[0] && ma < xx[8] + xx[12] - xx[0]) {
                                sron[t] = 1;
                            }
                        }

                        if (sracttype[t] == 2 || sracttype[t] == 4) {
                            if (srmuki[t] == 0) {
                                sra[t] -= srsok[t];
                            }

                            if (srmuki[t] == 1) {
                                sra[t] += srsok[t];
                            }
                        }

                        if (sracttype[t] == 3 || sracttype[t] == 5) {
                            if (srmuki[t] == 0) {
                                srb[t] -= srsok[t];
                            }

                            if (srmuki[t] == 1) {
                                srb[t] += srsok[t];
                            }
                        }

                        for (tt = 0; tt < amax; ++tt) {
                            if (azimentype[tt] == 1 && aa[tt] + anobia[tt] - fx > xx[8] + xx[0] && aa[tt] - fx < xx[8] + xx[12] - xx[0] && ab[tt] + anobib[tt] > xx[11] - 100 && ab[tt] + anobib[tt] < xx[11] + xx[1] + 500 && ad[tt] >= -100) {
                                ab[tt] = xx[9] - anobib[tt] + 100;
                                ad[tt] = 0;
                                axzimen[tt] = 1;
                            }
                        }
                    }
                }

                for (t = 0; t < emax; ++t) {
                    xx[0] = ea[t] - fx;
                    xx[1] = eb[t] - fy;
                    xx[2] = enobia[t] / 100;
                    xx[3] = enobib[t] / 100;
                    if (etm[t] >= 0) {
                        --etm[t];
                    }

                    if (xx[0] + xx[2] * 100 >= -10 && xx[1] <= fxmax && xx[1] + xx[3] * 100 >= -8010 && xx[3] <= fymax && etm[t] >= 0) {
                        ea[t] += ec[t];
                        eb[t] += ed[t];
                        ec[t] += ee[t];
                        ed[t] += ef[t];
                    } else {
                        ea[t] = -9000000;
                    }
                }

                for (t = 0; t < bmax; ++t) {
                    if (ba[t] >= -80000) {
                        if (btm[t] >= 0) {
                            --btm[t];
                        }

                        for (tt = 0; tt <= 1; ++tt) {
                            xx[0] = 0;
                            xx[1] = 0;
                            if (bz[t] == 0 && btm[t] < 0 && ba[t] - fx >= fxmax + 2000 && ba[t] - fx < fxmax + 2000 + mc && tt == 0) {
                                xx[0] = 1;
                                amuki[aco] = 0;
                            }

                            if (bz[t] == 0 && btm[t] < 0 && ba[t] - fx >= -400 - anx[btype[t]] + mc && ba[t] - fx < -400 - anx[btype[t]] && tt == 1) {
                                xx[0] = 1;
                                xx[1] = 1;
                                amuki[aco] = 1;
                            }

                            if (bz[t] == 1 && ba[t] - fx >= 0 - anx[btype[t]] && ba[t] - fx <= fxmax + 4000 && bb[t] - fy >= -9000 && bb[t] - fy <= fymax + 4000 && btm[t] < 0) {
                                xx[0] = 1;
                                bz[t] = 0;
                            }

                            if (xx[0] == 1) {
                                btm[t] = 401;
                                xx[0] = 0;
                                if (btype[t] >= 10) {
                                    btm[t] = 9999999;
                                }

                                ayobi(ba[t], bb[t], 0, 0, 0, btype[t], bxtype[t]);
                            }
                        }
                    }
                }

                for (t = 0; t < amax; ++t) {
                    xx[0] = aa[t] - fx;
                    xx[1] = ab[t] - fy;
                    xx[2] = anobia[t];
                    xx[3] = anobib[t];
                    xx[14] = 12000;
                    if (anotm[t] >= 0) {
                        --anotm[t];
                    }

                    if (xx[0] + xx[2] >= -xx[14] && xx[0] <= fxmax + xx[14] && xx[1] + xx[3] >= -9010 && xx[1] <= fymax + 20000) {
                        aacta[t] = 0;
                        aactb[t] = 0;
                        xx[10] = 0;
                        label2243:
                        switch (atype[t]) {
                            case 0:
                                xx[10] = 100;
                                break;
                            case 1:
                                xx[10] = 100;
                                break;
                            case 2:
                                xx[10] = 0;
                                xx[17] = 800;
                                if (axtype[t] >= 1) {
                                    xx[10] = xx[17];
                                }

                                if (axtype[t] >= 1) {
                                    for (tt = 0; tt < amax; ++tt) {
                                        xx[0] = 250;
                                        xx[5] = -800;
                                        xx[12] = 0;
                                        xx[1] = 1600;
                                        xx[8] = aa[tt] - fx;
                                        xx[9] = ab[tt] - fy;
                                        if (t != tt && aa[t] + anobia[t] - fx > xx[8] + xx[0] * 2 && aa[t] - fx < xx[8] + anobia[tt] - xx[0] * 2 && ab[t] + anobib[t] - fy > xx[9] + xx[5] && ab[t] + anobib[t] - fy < xx[9] + xx[1] * 3 + xx[12] + 1500) {
                                            aa[tt] = -800000;
                                            ot(oto[6]);
                                        }
                                    }
                                }
                                break;
                            case 3:
                                azimentype[t] = 0;
                                if (axtype[t] == 0) {
                                    ab[t] -= 800;
                                }

                                if (axtype[t] == 1) {
                                    ab[t] += 1200;
                                }
                                break;
                            case 4:
                                xx[10] = 120;
                                xx[0] = 250;
                                xx[8] = aa[t] - fx;
                                xx[9] = ab[t] - fy;
                                if (atm[t] >= 0) {
                                    --atm[t];
                                }

                                if (ma + mnobia > xx[8] + xx[0] * 2 - 3000 && ma < xx[8] + anobia[t] - xx[0] * 2 + 3000 && md <= -600 && atm[t] <= 0 && axtype[t] == 1 && mzimen == 0 && axzimen[t] == 1) {
                                    ad[t] = -1600;
                                    atm[t] = 40;
                                    ab[t] -= 1000;
                                }
                                break;
                            case 5:
                                xx[10] = 160;
                                break;
                            case 6:
                                if (azimentype[t] == 30) {
                                    ad[t] = -1600;
                                    ab[t] += ad[t];
                                }

                                xx[10] = 120;
                                if (atm[t] >= 10) {
                                    ++atm[t];
                                    if (mhp >= 1) {
                                        if (atm[t] <= 19) {
                                            ma = xx[0];
                                            mb = xx[1] - 3000;
                                            mtype = 0;
                                        }

                                        xx[10] = 0;
                                        if (atm[t] == 20) {
                                            mc = 700;
                                            mkeytm = 24;
                                            md = -1200;
                                            mb = xx[1] - 1000 - 3000;
                                            amuki[t] = 1;
                                            if (axtype[t] == 1) {
                                                mc = 840;
                                                axtype[t] = 0;
                                            }
                                        }

                                        if (atm[t] == 40) {
                                            amuki[t] = 0;
                                            atm[t] = 0;
                                        }
                                    }
                                }

                                if (axtype[t] == 1) {
                                    for (tt = 0; tt < smax; ++tt) {
                                        if (stype[tt] == 300 && aa[t] - fx >= -8000 && aa[t] >= sa[tt] + 2000 && aa[t] <= sa[tt] + 3600 && axzimen[t] == 1) {
                                            sa[tt] = -800000;
                                            atm[t] = 100;
                                        }
                                    }

                                    if (atm[t] == 100) {
                                        eyobi(aa[t] + 1200 - 1200, ab[t] + 3000 - 30000 - 1500, 0, 0, 0, 0, 1000, 28800, 4, 20);
                                        if (mtype == 300) {
                                            mtype = 0;
                                            StopSoundMem(oto[11]);
                                            bgmchange(oto[100]);
                                            PlaySoundMem(oto[0]);
                                        }

                                        for (t1 = 0; t1 < smax; ++t1) {
                                            if (stype[t1] == 104) {
                                                sa[t1] = -80000000;
                                            }
                                        }
                                    }

                                    if (atm[t] == 120) {
                                        eyobi(aa[t] + 1200 - 1200, ab[t] + 3000 - 30000 - 1500, 600, -1200, 0, 160, 1000, 28800, 4, 240);
                                        amuki[t] = 1;
                                    }

                                    if (atm[t] == 140) {
                                        amuki[t] = 0;
                                        atm[t] = 0;
                                    }
                                }

                                if (atm[t] >= 220) {
                                    atm[t] = 0;
                                    amuki[t] = 0;
                                }

                                tt = 0;

                                while (true) {
                                    if (tt >= amax) {
                                        break label2243;
                                    }

                                    xx[0] = 250;
                                    xx[5] = -800;
                                    xx[12] = 0;
                                    xx[1] = 1600;
                                    xx[8] = aa[tt] - fx;
                                    xx[9] = ab[tt] - fy;
                                    if (t != tt && atype[tt] >= 100 && aa[t] + anobia[t] - fx > xx[8] + xx[0] * 2 && aa[t] - fx < xx[8] + anobia[tt] - xx[0] * 2 && ab[t] + anobib[t] - fy > xx[9] + xx[5] && ab[t] + anobib[t] - fy < xx[9] + xx[1] * 3 + xx[12] + 1500) {
                                        amuki[tt] = 1;
                                        aa[tt] = aa[t] + 300;
                                        ab[tt] = ab[t] - 3000;
                                        abrocktm[tt] = 120;
                                        atm[t] = 200;
                                        amuki[t] = 1;
                                    }

                                    ++tt;
                                }
                            case 7:
                                azimentype[t] = 0;
                                xx[10] = 0;
                                xx[11] = 400;
                                if (axtype[t] == 0) {
                                    xx[10] = xx[11];
                                }

                                if (axtype[t] == 1) {
                                    xx[10] = -xx[11];
                                }

                                if (axtype[t] == 2) {
                                    ab[t] -= xx[11];
                                }

                                if (axtype[t] == 3) {
                                    ab[t] += xx[11];
                                }
                                break;
                            case 8:
                                azimentype[t] = 0;
                                xx[22] = 20;
                                if (atm[t] == 0) {
                                    af[t] += xx[22];
                                    ad[t] += xx[22];
                                }

                                if (atm[t] == 1) {
                                    af[t] -= xx[22];
                                    ad[t] -= xx[22];
                                }

                                if (ad[t] > 300) {
                                    ad[t] = 300;
                                }

                                if (ad[t] < -300) {
                                    ad[t] = -300;
                                }

                                if (af[t] >= 1200) {
                                    atm[t] = 1;
                                }

                                if (af[t] < 0) {
                                    atm[t] = 0;
                                }

                                ab[t] += ad[t];
                                break;
                            case 9:
                                azimentype[t] = 5;
                                ab[t] += ad[t];
                                ad[t] += 100;
                                if (ab[t] >= fymax + 1000) {
                                    ad[t] = 900;
                                }

                                if (ab[t] >= fymax + 12000) {
                                    ab[t] = fymax;
                                    ad[t] = -2600;
                                }
                                break;
                            case 10:
                                azimentype[t] = 0;
                                xx[10] = 0;
                                xx[11] = 400;
                                if (axtype[t] == 0) {
                                    xx[10] = xx[11];
                                }

                                if (axtype[t] == 1) {
                                    xx[10] = -xx[11];
                                }
                                break;
                            case 30:
                                ++atm[t];
                                if (axtype[t] == 0) {
                                    if (atm[t] == 50 && mb >= 6000) {
                                        ac[t] = 300;
                                        ad[t] -= 1600;
                                        ab[t] -= 1000;
                                    }

                                    for (tt = 0; tt < amax; ++tt) {
                                        xx[0] = 250;
                                        xx[5] = -800;
                                        xx[12] = 0;
                                        xx[1] = 1600;
                                        xx[8] = aa[tt] - fx;
                                        xx[9] = ab[tt] - fy;
                                        if (t != tt && atype[tt] == 102 && aa[t] + anobia[t] - fx > xx[8] + xx[0] * 2 && aa[t] - fx < xx[8] + anobia[tt] - xx[0] * 2 && ab[t] + anobib[t] - fy > xx[9] + xx[5] && ab[t] + anobib[t] - fy < xx[9] + xx[1] * 3 + xx[12] + 1500) {
                                            aa[tt] = -800000;
                                            axtype[t] = 1;
                                            ad[t] = -1600;
                                            amsgtm[t] = 30;
                                            amsgtype[t] = 25;
                                        }
                                    }
                                }

                                if (axtype[t] == 1) {
                                    azimentype[t] = 0;
                                    ab[t] += ad[t];
                                    ad[t] += 120;
                                }
                                break;
                            case 79:
                                azimentype[t] = 0;
                                xx[10] = 1600;
                                if (axtype[t] == 1) {
                                    xx[10] = 1200;
                                    ab[t] -= 200;
                                }

                                if (axtype[t] == 2) {
                                    xx[10] = 1200;
                                    ab[t] += 200;
                                }

                                if (axtype[t] == 3) {
                                    xx[10] = 900;
                                    ab[t] -= 600;
                                }

                                if (axtype[t] == 4) {
                                    xx[10] = 900;
                                    ab[t] += 600;
                                }
                                break;
                            case 80:
                                azimentype[t] = 0;
                                break;
                            case 81:
                                azimentype[t] = 0;
                                break;
                            case 82:
                                azimentype[t] = 0;
                                break;
                            case 83:
                                azimentype[t] = 0;
                                break;
                            case 84:
                                azimentype[t] = 2;
                                break;
                            case 85:
                                xx[23] = 400;
                                if (axtype[t] == 0) {
                                    axtype[t] = 1;
                                    amuki[t] = 1;
                                }

                                if (mb >= 30000 && ma >= aa[t] - 15000 - fx && ma <= aa[t] - fx && axtype[t] == 1) {
                                    axtype[t] = 5;
                                    amuki[t] = 0;
                                }

                                if (mb >= 24000 && ma <= aa[t] + 24000 - fx && ma >= aa[t] - fx && axtype[t] == 1) {
                                    axtype[t] = 5;
                                    amuki[t] = 1;
                                }

                                if (axtype[t] == 5) {
                                    xx[10] = xx[23];
                                }
                                break;
                            case 86:
                                azimentype[t] = 4;
                                xx[23] = 1000;
                                if (ma >= aa[t] - fx - mnobia - xx[26] && ma <= aa[t] - fx + anobia[t] + xx[26]) {
                                    atm[t] = 1;
                                }

                                if (atm[t] == 1) {
                                    ab[t] += 1200;
                                }
                                break;
                            case 87:
                                azimentype[t] = 0;
                                if (aa[t] % 10 != 1) {
                                    atm[t] += 6;
                                } else {
                                    atm[t] -= 6;
                                }

                                xx[25] = 2;
                                if (atm[t] > 360 * xx[25]) {
                                    atm[t] -= 360 * xx[25];
                                }

                                if (atm[t] < 0) {
                                    atm[t] += 360 * xx[25];
                                }

                                tt = 0;

                                while (true) {
                                    if (tt > axtype[t] % 100) {
                                        break label2243;
                                    }

                                    xx[26] = 18;
                                    xd[4] = (double) (tt * xx[26]) * Math.cos((double) atm[t] * pai / 180.0D / 2.0D);
                                    xd[5] = (double) (tt * xx[26]) * Math.sin((double) atm[t] * pai / 180.0D / 2.0D);
                                    xx[4] = 1800;
                                    xx[5] = 800;
                                    xx[8] = aa[t] - fx + (int) xd[4] * 100 - xx[4] / 2;
                                    xx[9] = ab[t] - fy + (int) xd[5] * 100 - xx[4] / 2;
                                    if (ma + mnobia > xx[8] + xx[5] && ma < xx[8] + xx[4] - xx[5] && mb + mnobib > xx[9] + xx[5] && mb < xx[9] + xx[4] - xx[5]) {
                                        --mhp;
                                        mmsgtype = 51;
                                        mmsgtm = 30;
                                    }

                                    ++tt;
                                }
                            case 90:
                                xx[10] = 160;
                                break;
                            case 100:
                                azimentype[t] = 1;
                                xx[10] = 100;
                                if (axtype[t] == 2) {
                                    for (tt = 0; tt < amax; ++tt) {
                                        xx[0] = 250;
                                        xx[5] = -800;
                                        xx[12] = 0;
                                        xx[1] = 1600;
                                        xx[8] = aa[tt] - fx;
                                        xx[9] = ab[tt] - fy;
                                        if (t != tt && aa[t] + anobia[t] - fx > xx[8] + xx[0] * 2 && aa[t] - fx < xx[8] + anobia[tt] - xx[0] * 2 && ab[t] + anobib[t] - fy > xx[9] + xx[5] && ab[t] + anobib[t] - fy < xx[9] + xx[1] * 3 + xx[12] && (atype[tt] == 0 || atype[tt] == 4)) {
                                            atype[tt] = 90;
                                            anobia[tt] = 6400;
                                            anobib[tt] = 6300;
                                            axtype[tt] = 0;
                                            aa[tt] -= 1050;
                                            ab[tt] -= 1050;
                                            ot(oto[9]);
                                            aa[t] = -80000000;
                                        }
                                    }
                                }
                                break;
                            case 102:
                                azimentype[t] = 1;
                                xx[10] = 100;
                                if (axtype[t] == 1) {
                                    xx[10] = 200;
                                }
                                break;
                            case 110:
                                azimentype[t] = 1;
                                xx[10] = 200;
                                if (axzimen[t] == 1) {
                                    ab[t] -= 1200;
                                    ad[t] = -1400;
                                }
                                break;
                            case 151:
                                azimentype[t] = 2;
                                break;
                            case 200:
                                azimentype[t] = 1;
                                xx[10] = 100;
                        }

                        if (abrocktm[t] >= 1) {
                            xx[10] = 0;
                        }

                        if (amuki[t] == 0) {
                            aacta[t] -= xx[10];
                        }

                        if (amuki[t] == 1) {
                            aacta[t] += xx[10];
                        }

                        xx[0] = 850;
                        xx[1] = 1200;
                        if (ad[t] > xx[1] && azimentype[t] != 5) {
                            ad[t] = xx[1];
                        }

                        aa[t] += aacta[t];
                        if ((azimentype[t] >= 1 || azimentype[t] == -1) && abrocktm[t] <= 0) {
                            aa[t] += ac[t];
                            if (azimentype[t] >= 1 && azimentype[t] <= 3) {
                                ab[t] += ad[t];
                                ad[t] += 120;
                            }

                            if (axzimen[t] == 1) {
                                xx[0] = 100;
                                if (ac[t] >= 200) {
                                    ac[t] -= xx[0];
                                } else if (ac[t] <= -200) {
                                    ac[t] += xx[0];
                                } else {
                                    ac[t] = 0;
                                }
                            }

                            axzimen[t] = 0;
                            if (azimentype[t] != 2) {
                                tekizimen();
                            }
                        }

                        if (abrocktm[t] > 0) {
                            --abrocktm[t];
                            if (abrocktm[t] < 100) {
                                ab[t] -= 180;
                            }

                            if (abrocktm[t] > 100) {
                                ;
                            }

                            if (abrocktm[t] == 100) {
                                ab[t] -= 800;
                                ad[t] = -1200;
                                ac[t] = 700;
                                abrocktm[t] = 0;
                            }
                        }

                        xx[0] = 250;
                        xx[1] = 1600;
                        xx[2] = 1000;
                        xx[4] = 500;
                        xx[5] = -800;
                        xx[8] = aa[t] - fx;
                        xx[9] = ab[t] - fy;
                        xx[12] = 0;
                        if (md >= 100) {
                            xx[12] = md;
                        }

                        xx[25] = 0;
                        if (ma + mnobia > xx[8] + xx[0] * 2 && ma < xx[8] + anobia[t] - xx[0] * 2 && mb + mnobib > xx[9] - xx[5] && mb + mnobib < xx[9] + xx[1] + xx[12] && (mmutekitm <= 0 || md >= 100) && abrocktm[t] <= 0 && atype[t] != 4 && atype[t] != 9 && atype[t] != 10 && (atype[t] <= 78 || atype[t] == 85) && mzimen != 1 && mtype != 200) {
                            if (atype[t] == 0) {
                                if (axtype[t] == 0) {
                                    aa[t] = -900000;
                                }

                                if (axtype[t] == 1) {
                                    ot(oto[5]);
                                    mb = xx[9] - 900 - anobib[t];
                                    md = -2100;
                                    xx[25] = 1;
                                    actaon[2] = 0;
                                }
                            }

                            if (atype[t] == 1) {
                                atype[t] = 2;
                                anobib[t] = 3000;
                                axtype[t] = 0;
                            } else if (atype[t] == 2 && md >= 0) {
                                if (axtype[t] != 1 && axtype[t] != 2) {
                                    if (axtype[t] == 0) {
                                        if (ma + mnobia > xx[8] + xx[0] * 2 && ma < xx[8] + anobia[t] / 2 - xx[0] * 4) {
                                            axtype[t] = 1;
                                            amuki[t] = 1;
                                        } else {
                                            axtype[t] = 1;
                                            amuki[t] = 0;
                                        }
                                    }
                                } else {
                                    axtype[t] = 0;
                                }
                            }

                            if (atype[t] == 3) {
                                xx[25] = 1;
                            }

                            if (atype[t] == 6) {
                                atm[t] = 10;
                                md = 0;
                                actaon[2] = 0;
                            }

                            if (atype[t] == 7) {
                                aa[t] = -900000;
                            }

                            if (atype[t] == 8) {
                                atype[t] = 151;
                                ad[t] = 0;
                            }

                            if (atype[t] != 85 && xx[25] == 0) {
                                ot(oto[5]);
                                mb = xx[9] - 1000 - anobib[t];
                                md = -1000;
                            }

                            if (atype[t] == 85 && xx[25] == 0) {
                                ot(oto[5]);
                                mb = xx[9] - 4000;
                                md = -1000;
                                axtype[t] = 5;
                            }

                            if (actaon[2] == 1) {
                                md = -1600;
                                actaon[2] = 0;
                            }
                        }

                        xx[15] = -500;
                        xx[16] = 0;
                        if (atype[t] == 4 || atype[t] == 9 || atype[t] == 10) {
                            xx[16] = -3000;
                        }

                        if (atype[t] == 82 || atype[t] == 83 || atype[t] == 84) {
                            xx[16] = -3200;
                        }

                        if (atype[t] == 85) {
                            xx[16] = -anobib[t] + 6000;
                        }

                        if (ma + mnobia > xx[8] + xx[4] && ma < xx[8] + anobia[t] - xx[4] && mb < xx[9] + anobib[t] + xx[15] && mb + mnobib > xx[9] + anobib[t] - xx[0] + xx[16] && anotm[t] <= 0 && abrocktm[t] <= 0) {
                            if (mmutekion == 1) {
                                aa[t] = -9000000;
                            }

                            if (mmutekitm <= 0 && (atype[t] <= 99 || atype[t] >= 200) && mmutekion != 1 && mtype != 200) {
                                if ((atype[t] != 2 || axtype[t] != 0) && mhp >= 1 && atype[t] != 6) {
                                    --mhp;
                                }

                                if (atype[t] == 6) {
                                    atm[t] = 10;
                                }

                                if (mhp == 0) {
                                    if (atype[t] == 0 || atype[t] == 7) {
                                        amsgtm[t] = 60;
                                        amsgtype[t] = rand(7) + 1 + 1000 + (stb - 1) * 10;
                                    }

                                    if (atype[t] == 1) {
                                        amsgtm[t] = 60;
                                        amsgtype[t] = 15;
                                    }

                                    if (atype[t] == 2 && axtype[t] >= 1 && mmutekitm <= 0) {
                                        amsgtm[t] = 60;
                                        amsgtype[t] = 18;
                                    }

                                    if (atype[t] == 3) {
                                        amsgtm[t] = 60;
                                        amsgtype[t] = 20;
                                    }

                                    if (atype[t] == 4) {
                                        amsgtm[t] = 60;
                                        amsgtype[t] = rand(7) + 1 + 1000 + (stb - 1) * 10;
                                    }

                                    if (atype[t] == 5) {
                                        amsgtm[t] = 60;
                                        amsgtype[t] = 21;
                                    }

                                    if (atype[t] == 9 || atype[t] == 10) {
                                        mmsgtm = 30;
                                        mmsgtype = 54;
                                    }

                                    if (atype[t] == 31) {
                                        amsgtm[t] = 30;
                                        amsgtype[t] = 24;
                                    }

                                    if (atype[t] == 80 || atype[t] == 81) {
                                        amsgtm[t] = 60;
                                        amsgtype[t] = 30;
                                    }

                                    if (atype[t] == 82) {
                                        amsgtm[t] = 20;
                                        amsgtype[t] = 31;
                                        xx[24] = 900;
                                        atype[t] = 83;
                                        aa[t] -= xx[24] + 100;
                                        ab[t] -= xx[24] - 0;
                                    }

                                    if (atype[t] == 84) {
                                        mmsgtm = 30;
                                        mmsgtype = 50;
                                    }

                                    if (atype[t] == 85) {
                                        amsgtm[t] = 60;
                                        amsgtype[t] = 85;
                                    }

                                    if (atype[t] == 80) {
                                        atype[t] = 81;
                                    }
                                }

                                if (atype[t] == 2) {
                                    if (axtype[t] == 0) {
                                        if (ma + mnobia > xx[8] + xx[0] * 2 && ma < xx[8] + anobia[t] / 2 - xx[0] * 4) {
                                            axtype[t] = 1;
                                            amuki[t] = 1;
                                            aa[t] = ma + mnobia + fx + mc;
                                            mmutekitm = 5;
                                        } else {
                                            axtype[t] = 1;
                                            amuki[t] = 0;
                                            aa[t] = ma - anobia[t] + fx - mc;
                                            mmutekitm = 5;
                                        }
                                    } else {
                                        --mhp;
                                    }
                                }
                            }

                            if (atype[t] >= 100 && atype[t] <= 199) {
                                if (atype[t] == 100 && axtype[t] == 0) {
                                    mmsgtm = 30;
                                    mmsgtype = 1;
                                    ot(oto[9]);
                                }

                                if (atype[t] == 100 && axtype[t] == 1) {
                                    mmsgtm = 30;
                                    mmsgtype = 2;
                                    ot(oto[9]);
                                }

                                if (atype[t] == 100 && axtype[t] == 2) {
                                    mnobia = 5200;
                                    mnobib = 7300;
                                    ot(oto[9]);
                                    ma -= 1100;
                                    mb -= 4000;
                                    mtype = 1;
                                    mhp = 50000000;
                                }

                                if (atype[t] == 101) {
                                    --mhp;
                                    mmsgtm = 30;
                                    mmsgtype = 11;
                                }

                                if (atype[t] == 102) {
                                    --mhp;
                                    mmsgtm = 30;
                                    mmsgtype = 10;
                                }

                                if (atype[t] == 105) {
                                    if (axtype[t] == 0) {
                                        ot(oto[4]);
                                        sgtype[26] = 6;
                                    }

                                    if (axtype[t] == 1) {
                                        txtype[7] = 80;
                                        ot(oto[4]);
                                        ayobi(aa[t] - 24000 - 1000, -12000, 0, 0, 0, 110, 0);
                                        ayobi(aa[t] - 30000 + 1000, -3000, 0, 0, 0, 110, 0);
                                        ayobi(aa[t] + 12000 + 1000, -6000, 0, 0, 0, 110, 0);
                                        ayobi(aa[t] + 15000 - 1000, -9000, 0, 0, 0, 110, 0);
                                        ayobi(aa[t] + 18000 + 1000, -12000, 0, 0, 0, 110, 0);
                                        ayobi(aa[t] + 21000 - 1000, -6000, 0, 0, 0, 110, 0);
                                        ayobi(aa[t] + 24000 + 1000, -7000, 0, 0, 0, 110, 0);
                                        tb[0] += 9000;
                                    }
                                }

                                if (atype[t] == 110) {
                                    --mhp;
                                    mmsgtm = 30;
                                    mmsgtype = 3;
                                }

                                aa[t] = -90000000;
                            }
                        }
                    } else {
                        aa[t] = -9000000;
                    }
                }

                if (kscroll != 1 && kscroll != 2) {
                    xx[2] = mascrollmax;
                    xx[3] = 0;
                    xx[1] = xx[2];
                    if (ma > xx[1] && fzx < scrollx) {
                        xx[5] = ma - xx[1];
                        ma = xx[1];
                        fx += xx[5];
                        fzx += xx[5];
                        if (xx[1] <= 5000) {
                            xx[3] = 1;
                        }
                    }
                }
            }

            if (main == 2) {
                ++maintm;
                xx[7] = 46;
                if (key_Space) {
                    for (t = 0; t <= xx[7]; ++t) {
                        xx[12 + t] -= 300;
                    }
                }

                if (maintm <= 1) {
                    maintm = 2;
                    bgmchange(oto[106]);
                    PlaySoundMem(oto[0]);
                    xx[10] = 0;

                    for (t = 0; t <= xx[7]; ++t) {
                        xx[12 + t] = 980000;
                    }

                    xx[12] = 460;
                    xx[13] = 540;
                    xx[14] = 590;
                    xx[15] = 650;
                    xx[16] = 700;
                    xx[17] = 760;
                    xx[18] = 810;
                    xx[19] = 870;
                    xx[20] = 920;
                    xx[21] = 1000;
                    xx[22] = 1050;
                    xx[23] = 1100;
                    xx[24] = 1180;
                    xx[25] = 1230;
                    xx[26] = 1360;
                    xx[27] = 1410;
                    xx[28] = 1540;
                    xx[29] = 1590;
                    xx[30] = 1800;

                    for (t = 0; t <= xx[7]; ++t) {
                        xx[12 + t] *= 100;
                    }
                }

                ++xx[10];

                for (t = 0; t <= xx[7]; ++t) {
                    xx[12 + t] -= 100;
                }

                if (xx[30] == -200) {
                    bgmchange(oto[106]);
                }

                if (xx[30] <= -400) {
                    main = 100;
                    nokori = 2;
                    maintm = 0;
                    ending = 0;
                }
            }

            if (main == 10) {
                ++maintm;
                if (fast == 1) {
                    maintm += 2;
                }

                if (maintm >= 30) {
                    maintm = 0;
                    main = 1;
                    zxon = 0;
                }
            }

            if (main == 100) {
                ++maintm;
                xx[0] = 0;
                if (maintm <= 10) {
                    maintm = 11;
                    sta = 1;
                    stb = 1;
                    stc = 0;
                    over = 0;
                    StopSoundMem(oto[0]);
                }

                if (key_1) {
                    sta = 1;
                    stb = 1;
                    stc = 0;
                }

                if (key_2) {
                    sta = 1;
                    stb = 2;
                    stc = 0;
                }

                if (key_3) {
                    sta = 1;
                    stb = 3;
                    stc = 0;
                }

                if (key_4) {
                    sta = 1;
                    stb = 4;
                    stc = 0;
                }

                if (key_0) {
                    xx[0] = 1;
                    over = 1;
                }

                if (key_Enter) {
                    xx[0] = 1;
                }

                if (key_Z) {
                    xx[0] = 1;
                }

                if (xx[0] == 1) {
                    main = 10;
                    zxon = 0;
                    maintm = 0;
                    nokori = 2;
                    fast = 0;
                    trap = 0;
                    tyuukan = 0;
                }
            }

            gflag = false;
            repaint();

            while (!gflag) {
                wait(1);
            }

            xx[0] = 32;
            if (key_Space) {
                xx[0] = 64;
            }

            wait2(stime, System.currentTimeMillis(), 1000 / xx[0]);
        }
    }

    void tekizimen() {
        for (tt = 0; tt < smax; ++tt) {
            if (sa[tt] - fx + sc[tt] >= -12010 && sa[tt] - fx <= fxmax + 12100 && stype[tt] <= 99) {
                xx[0] = 200;
                xx[2] = 1000;
                xx[1] = 2000;
                xx[8] = sa[tt] - fx;
                xx[9] = sb[tt] - fy;
                if (aa[t] + anobia[t] - fx > xx[8] - xx[0] && aa[t] - fx < xx[8] + xx[2] && ab[t] + anobib[t] - fy > xx[9] + xx[1] * 3 / 4 && ab[t] - fy < xx[9] + sd[tt] - xx[2]) {
                    aa[t] = xx[8] - xx[0] - anobia[t] + fx;
                    amuki[t] = 0;
                }

                if (aa[t] + anobia[t] - fx > xx[8] + sc[tt] - xx[0] && aa[t] - fx < xx[8] + sc[tt] + xx[0] && ab[t] + anobib[t] - fy > xx[9] + xx[1] * 3 / 4 && ab[t] - fy < xx[9] + sd[tt] - xx[2]) {
                    aa[t] = xx[8] + sc[tt] + xx[0] + fx;
                    amuki[t] = 1;
                }

                if (aa[t] + anobia[t] - fx > xx[8] + xx[0] && aa[t] - fx < xx[8] + sc[tt] - xx[0] && ab[t] + anobib[t] - fy > xx[9] && ab[t] + anobib[t] - fy < xx[9] + sd[tt] - xx[1] && ad[t] >= -100) {
                    ab[t] = sb[tt] - fy - anobib[t] + 100 + fy;
                    ad[t] = 0;
                    axzimen[t] = 1;
                }

                if (aa[t] + anobia[t] - fx > xx[8] + xx[0] && aa[t] - fx < xx[8] + sc[tt] - xx[0] && ab[t] - fy > xx[9] + sd[tt] - xx[1] && ab[t] - fy < xx[9] + sd[tt] + xx[0]) {
                    ab[t] = xx[9] + sd[tt] + xx[0] + fy;
                    if (ad[t] < 0) {
                        ad[t] = -ad[t] * 2 / 3;
                    }
                }
            }
        }

        for (tt = 0; tt < tmax; ++tt) {
            xx[0] = 200;
            xx[1] = 3000;
            xx[2] = 1000;
            xx[8] = ta[tt] - fx;
            xx[9] = tb[tt] - fy;
            if (ta[tt] - fx + xx[1] >= -12010 && ta[tt] - fx <= fxmax + 12000) {
                if (atype[t] != 86 && atype[t] != 90 && ttype[tt] != 140) {
                    if (ttype[tt] != 7 && ttype[tt] != 117 && aa[t] + anobia[t] - fx > xx[8] + xx[0] && aa[t] - fx < xx[8] + xx[1] - xx[0] * 1 && ab[t] + anobib[t] - fy > xx[9] && ab[t] + anobib[t] - fy < xx[9] + xx[1] && ad[t] >= -100) {
                        ab[t] = xx[9] - anobib[t] + 100 + fy;
                        ad[t] = 0;
                        axzimen[t] = 1;
                        if (ttype[tt] == 120) {
                            ad[t] = -1600;
                            azimentype[t] = 30;
                        }
                    }

                    if (ttype[tt] != 117 && aa[t] + anobia[t] - fx > xx[8] + xx[0] && aa[t] - fx < xx[8] + xx[1] - xx[0] * 1 && ab[t] - fy > xx[9] + xx[1] - xx[1] && ab[t] - fy < xx[9] + xx[1] + xx[0]) {
                        ab[t] = xx[9] + xx[1] + xx[0] + fy;
                        if (ad[t] < 0) {
                            ad[t] = 0;
                        }
                    }

                    xx[27] = 0;
                    if ((atype[t] >= 100 || ttype[tt] != 7 || ttype[tt] == 7 && atype[t] == 2) && ttype[tt] != 117) {
                        if (aa[t] + anobia[t] - fx > xx[8] && aa[t] - fx < xx[8] + xx[2] && ab[t] + anobib[t] - fy > xx[9] + xx[1] / 2 - xx[0] && ab[t] - fy < xx[9] + xx[2]) {
                            aa[t] = xx[8] - anobia[t] + fx;
                            ac[t] = 0;
                            amuki[t] = 0;
                            xx[27] = 1;
                        }

                        if (aa[t] + anobia[t] - fx > xx[8] + xx[1] - xx[0] * 2 && aa[t] - fx < xx[8] + xx[1] && ab[t] + anobib[t] - fy > xx[9] + xx[1] / 2 - xx[0] && ab[t] - fy < xx[9] + xx[2]) {
                            aa[t] = xx[8] + xx[1] + fx;
                            ac[t] = 0;
                            amuki[t] = 1;
                            xx[27] = 1;
                        }

                        if (xx[27] == 1 && (ttype[tt] == 7 || ttype[tt] == 1) && atype[t] == 2) {
                            if (ttype[tt] == 7) {
                                ot(oto[4]);
                                ttype[tt] = 3;
                                eyobi(ta[tt] + 10, tb[tt], 0, -800, 0, 40, 3000, 3000, 0, 16);
                            } else if (ttype[tt] == 1) {
                                ot(oto[3]);
                                eyobi(ta[tt] + 1200, tb[tt] + 1200, 300, -1000, 0, 160, 1000, 1000, 1, 120);
                                eyobi(ta[tt] + 1200, tb[tt] + 1200, -300, -1000, 0, 160, 1000, 1000, 1, 120);
                                eyobi(ta[tt] + 1200, tb[tt] + 1200, 240, -1400, 0, 160, 1000, 1000, 1, 120);
                                eyobi(ta[tt] + 1200, tb[tt] + 1200, -240, -1400, 0, 160, 1000, 1000, 1, 120);
                                brockbreak(tt);
                            }
                        }
                    }
                }

                if ((atype[t] == 86 || atype[t] == 90) && aa[t] + anobia[t] - fx > xx[8] && aa[t] - fx < xx[8] + xx[1] && ab[t] + anobib[t] - fy > xx[9] && ab[t] - fy < xx[9] + xx[1]) {
                    ot(oto[3]);
                    eyobi(ta[tt] + 1200, tb[tt] + 1200, 300, -1000, 0, 160, 1000, 1000, 1, 120);
                    eyobi(ta[tt] + 1200, tb[tt] + 1200, -300, -1000, 0, 160, 1000, 1000, 1, 120);
                    eyobi(ta[tt] + 1200, tb[tt] + 1200, 240, -1400, 0, 160, 1000, 1000, 1, 120);
                    eyobi(ta[tt] + 1200, tb[tt] + 1200, -240, -1400, 0, 160, 1000, 1000, 1, 120);
                    brockbreak(tt);
                }
            }

            if (ttype[tt] == 140 && ab[t] - fy > xx[9] - xx[0] * 2 - 2000 && ab[t] - fy < xx[9] + xx[1] - xx[0] * 2 + 2000 && aa[t] + anobia[t] - fx > xx[8] - 400 && aa[t] - fx < xx[8] + xx[1]) {
                ta[tt] = -800000;
                sracttype[20] = 1;
                sron[20] = 1;
            }
        }

    }

    void wait(int var1) {
        try {
            Thread.sleep((long) var1);
        } catch (InterruptedException var3) {
            ;
        }

    }

    void end() {
    }

    void setcolor(int var1, int var2, int var3) {
        h.setColor(new Color(var1, var2, var3));
    }

    void setc0() {
        h.setColor(new Color(0, 0, 0));
    }

    void setc1() {
        h.setColor(new Color(255, 255, 255));
    }

    void drawpixel(int var1, int var2) {
    }

    void drawline(int var1, int var2, int var3, int var4) {
        h.drawLine(var1, var2, var3, var4);
    }

    void drawrect(int var1, int var2, int var3, int var4) {
        h.drawRect(var1, var2, var3, var4);
    }

    void fillrect(int var1, int var2, int var3, int var4) {
        h.fillRect(var1, var2, var3, var4);
    }

    void drawarc(int var1, int var2, int var3, int var4) {
        h.drawOval(var1 - var3 * 4 / 5, var2 - var4 * 7 / 5, var3 * 9 / 5, var4 * 9 / 5);
    }

    void fillarc(int var1, int var2, int var3, int var4) {
        h.fillOval(var1 - var3 * 4 / 5, var2 - var4 * 7 / 5, var3 * 9 / 5, var4 * 9 / 5);
    }

    int loadimage(String var1) {
        return 1000;
    }

    int loadimage(int var1, int var2, int var3, int var4, int var5) {
        return 1000;
    }

    void drawimage(Image var1, int var2, int var3) {
        try {
            if (var1 != null) {
                if (mirror == 0) {
                    h.drawImage(var1, var2, var3, this);
                }

                if (mirror == 1) {
                    h.drawImage(var1, var2 + var1.getWidth(this), var3, -var1.getWidth(this), var1.getHeight(this), this);
                }
            }
        } catch (Exception var5) {
            ;
        }

    }

    void drawimage(Image var1, int var2, int var3, int var4, int var5, int var6, int var7) {
    }

    void setre() {
    }

    void setre2() {
    }

    void setno() {
    }

    void str(String var1, int var2, int var3) {
        h.drawString(var1, var2, var3 + 16);
        xx[2] = 4;
    }

    void setfont(int var1) {
    }

    void ot(AudioClip var1) {
        var1.play();
    }

    void stagecls() {
        for (t = 0; t < smax; ++t) {
            sa[t] = -9000000;
            sb[t] = 1;
            sc[t] = 1;
            sd[t] = 1;
            sgtype[t] = 0;
            stype[t] = 0;
            sxtype[t] = 0;
        }

        for (t = 0; t < tmax; ++t) {
            ta[t] = -9000000;
            tb[t] = 1;
            tc[t] = 1;
            td[t] = 1;
            titem[t] = 0;
            txtype[t] = 0;
        }

        for (t = 0; t < srmax; ++t) {
            sra[t] = -9000000;
            srb[t] = 1;
            src[t] = 1;
            srd[t] = 1;
            sre[t] = 0;
            srf[t] = 0;
            srmuki[t] = 0;
            sron[t] = 0;
            sree[t] = 0;
            srsok[t] = 0;
            srmove[t] = 0;
            srmovep[t] = 0;
            srsp[t] = 0;
        }

        for (t = 0; t < amax; ++t) {
            aa[t] = -9000000;
            ab[t] = 1;
            ac[t] = 0;
            ad[t] = 1;
            azimentype[t] = 0;
            atype[t] = 0;
            axtype[t] = 0;
            ae[t] = 0;
            af[t] = 0;
            atm[t] = 0;
            a2tm[t] = 0;
            abrocktm[t] = 0;
            amsgtm[t] = 0;
        }

        for (t = 0; t < bmax; ++t) {
            ba[t] = -9000000;
            bb[t] = 1;
            bz[t] = 1;
            btm[t] = 0;
            bxtype[t] = 0;
        }

        for (t = 0; t < emax; ++t) {
            ea[t] = -9000000;
            eb[t] = 1;
            ec[t] = 1;
            ed[t] = 1;
            egtype[t] = 0;
        }

        for (t = 0; t < nmax; ++t) {
            na[t] = -9000000;
            nb[t] = 1;
            nc[t] = 1;
            nd[t] = 1;
            ne[t] = 1;
            nf[t] = 1;
            ng[t] = 0;
            ntype[t] = 0;
        }

        sco = 0;
        tco = 0;
        aco = 0;
        bco = 0;
        eco = 0;
        nco = 0;
    }

    void stage() {
        scrollx = 360000;
        stagep();

        for (tt = 0; tt <= 1000; ++tt) {
            for (t = 0; t <= 16; ++t) {
                xx[10] = 0;
                if (stagedate[t][tt] >= 1 && stagedate[t][tt] <= 255) {
                    xx[10] = stagedate[t][tt];
                }

                xx[21] = tt * 29;
                xx[22] = t * 29 - 12;
                xx[23] = xx[10];
                if (xx[10] >= 1 && xx[10] <= 19 && xx[10] != 9) {
                    tyobi(tt * 29, t * 29 - 12, xx[10]);
                }

                if (xx[10] >= 20 && xx[10] <= 29) {
                    sra[srco] = xx[21] * 100;
                    srb[srco] = xx[22] * 100;
                    src[srco] = 3000;
                    srtype[srco] = 0;
                    ++srco;
                    if (srco >= srmax) {
                        srco = 0;
                    }
                }

                if (xx[10] == 30) {
                    sa[sco] = xx[21] * 100;
                    sb[sco] = xx[22] * 100;
                    sc[sco] = 3000;
                    sd[sco] = 6000;
                    stype[sco] = 500;
                    ++sco;
                    if (sco >= smax) {
                        sco = 0;
                    }
                }

                if (xx[10] == 40) {
                    sa[sco] = xx[21] * 100;
                    sb[sco] = xx[22] * 100;
                    sc[sco] = 6000;
                    sd[sco] = 3000;
                    stype[sco] = 1;
                    ++sco;
                    if (sco >= smax) {
                        sco = 0;
                    }
                }

                if (xx[10] == 41) {
                    sa[sco] = xx[21] * 100 + 500;
                    sb[sco] = xx[22] * 100;
                    sc[sco] = 5000;
                    sd[sco] = 3000;
                    stype[sco] = 2;
                    ++sco;
                    if (sco >= smax) {
                        sco = 0;
                    }
                }

                if (xx[10] == 43) {
                    sa[sco] = xx[21] * 100;
                    sb[sco] = xx[22] * 100 + 500;
                    sc[sco] = 2900;
                    sd[sco] = 5300;
                    stype[sco] = 1;
                    ++sco;
                    if (sco >= smax) {
                        sco = 0;
                    }
                }

                if (xx[10] == 44) {
                    sa[sco] = xx[21] * 100;
                    sb[sco] = xx[22] * 100 + 700;
                    sc[sco] = 3900;
                    sd[sco] = 5000;
                    stype[sco] = 5;
                    ++sco;
                    if (sco >= smax) {
                        sco = 0;
                    }
                }

                if (xx[10] >= 50 && xx[10] <= 79) {
                    ba[bco] = xx[21] * 100;
                    bb[bco] = xx[22] * 100;
                    btype[bco] = xx[23] - 50;
                    ++bco;
                    if (bco >= bmax) {
                        bco = 0;
                    }
                }

                if (xx[10] >= 80 && xx[10] <= 89) {
                    na[nco] = xx[21] * 100;
                    nb[nco] = xx[22] * 100;
                    ntype[nco] = xx[23] - 80;
                    ++nco;
                    if (nco >= nmax) {
                        nco = 0;
                    }
                }

                if (xx[10] == 9) {
                    tyobi(tt * 29, t * 29 - 12, 800);
                }

                if (xx[10] == 99) {
                    sa[sco] = xx[21] * 100;
                    sb[sco] = xx[22] * 100;
                    sc[sco] = 3000;
                    sd[sco] = (12 - t) * 3000;
                    stype[sco] = 300;
                    ++sco;
                    if (sco >= smax) {
                        sco = 0;
                    }
                }
            }
        }

        if (tyuukan >= 1) {
            xx[17] = 0;

            for (t = 0; t < smax; ++t) {
                if (stype[t] == 500 && tyuukan >= 1) {
                    fx = sa[t] - fxmax / 2;
                    fzx = fx;
                    ma = sa[t] - fx;
                    mb = sb[t] - fy;
                    --tyuukan;
                    ++xx[17];
                    sa[t] = -80000000;
                }
            }

            tyuukan += xx[17];
        }

    }

    void stagep() {
        scrollx = 360000;
        if (sta == 1 && stb == 1 && stc == 0) {
            stagedatex = new byte[][]{{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 82, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 82, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 98, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 99, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 82, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 50, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 98, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 98, (byte) 98, (byte) 98, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 98, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 7, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 50, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 30, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 98, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 98, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 98, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 7, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 98, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 98, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 98, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 0, (byte) 0, (byte) 2, (byte) 0, (byte) 0, (byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 80, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 7, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 40, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 80, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 0, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 40, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 83, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 41, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 41, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 40, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 50, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 50, (byte) 0, (byte) 0, (byte) 81, (byte) 41, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 81, (byte) 98, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 81, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 50, (byte) 0, (byte) 50, (byte) 0, (byte) 0, (byte) 51, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 81, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 41, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 50, (byte) 0, (byte) 50, (byte) 0, (byte) 0, (byte) 41, (byte) 0, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 81, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5}, {(byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}};
            tyobi(232, 249, 100);
            tyobi(377, 249, 102);
            tyobi(406, 133, 101);
            tyobi(1015, 220, 110);
            tyobi(1363, 249, 103);
            tyobi(1711, 249, 112);
            tyobi(1943, 249, 104);
            sco = 0;
            t = sco;
            sa[t] = '\ue484';
            sb[t] = -6000;
            sc[t] = 5000;
            sd[t] = 70000;
            stype[t] = 100;
            ++sco;
            t = sco;
            sa[t] = 156100;
            sb[t] = -6000;
            sc[t] = 7000;
            sd[t] = 70000;
            stype[t] = 101;
            ++sco;
            t = sco;
            sa[t] = 325800;
            sb[t] = -6000;
            sc[t] = 3000;
            sd[t] = 70000;
            stype[t] = 102;
            ++sco;
            t = sco;
            sa[t] = 339300;
            sb[t] = 3100;
            sc[t] = 15000;
            sd[t] = 3000;
            stype[t] = 103;
            ++sco;
            t = sco;
            sa[t] = 362500;
            sb[t] = -6000;
            sc[t] = 9000;
            sd[t] = 70000;
            stype[t] = 101;
            ++sco;
            t = 28;
            sa[t] = 84600;
            sb[t] = 24900;
            sc[t] = 6000;
            sd[t] = 11800;
            stype[t] = 50;
            ++sco;
            t = sco;
            sa[t] = 142100;
            sb[t] = 13300;
            sc[t] = 8999;
            sd[t] = 3000;
            stype[t] = 51;
            sgtype[t] = 0;
            ++sco;
            t = sco;
            sa[t] = 208800;
            sb[t] = '\u8e94';
            sc[t] = 14999;
            sd[t] = 3000;
            stype[t] = 52;
            ++sco;
            bco = 0;
            t = bco;
            ba[t] = 78300;
            bb[t] = 24900;
            btype[t] = 0;
            bxtype[t] = 1;
            ++bco;
            t = bco;
            ba[t] = 298700;
            bb[t] = 14300;
            btype[t] = 80;
            bxtype[t] = 0;
            ++bco;

            for (tt = 0; tt <= 1000; ++tt) {
                for (t = 0; t <= 16; ++t) {
                    stagedate[t][tt] = 0;
                }
            }

            for (t = 0; t < stagedatex.length; ++t) {
                for (tt = 0; tt < stagedatex[t].length; ++tt) {
                    stagedate[t][tt] = stagedatex[t][tt];
                }
            }
        }

        if (sta == 1 && stb == 2 && stc == 0) {
            bgmchange(oto[100]);
            scrollx = 0;
            stagedatex = new byte[][]{{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 7, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 7}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 83, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 44, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5}, {(byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}};
            tco = 0;
            txtype[tco] = 1;
            tyobi(116, 249, 300);
            tyobi(377, 220, 114);
            sco = 0;
            t = sco;
            sa[t] = '\ua08c';
            sb[t] = 24900;
            sc[t] = 6000;
            sd[t] = 11800;
            stype[t] = 50;
            sxtype[t] = 1;
            ++sco;
            t = sco;
            sa[t] = '\u87f0';
            sb[t] = 30700;
            sc[t] = 3000;
            sd[t] = 5800;
            stype[t] = 40;
            sxtype[t] = 0;
            ++sco;
            t = sco;
            sa[t] = '\ua280';
            sb[t] = -6000;
            sc[t] = 5000;
            sd[t] = 70000;
            stype[t] = 100;
            sxtype[t] = 1;
            ++sco;

            for (tt = 0; tt <= 1000; ++tt) {
                for (t = 0; t <= 16; ++t) {
                    stagedate[t][tt] = 0;
                }
            }

            for (t = 0; t < stagedatex.length; ++t) {
                for (tt = 0; tt < stagedatex[t].length; ++tt) {
                    stagedate[t][tt] = stagedatex[t][tt];
                }
            }
        }

        if (sta == 1 && stb == 2 && stc == 1) {
            bgmchange(oto[103]);
            scrollx = 408000;
            ma = 6000;
            mb = 3000;
            stagecolor = 2;
            stagedatex = new byte[][]{{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 98, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 7, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 44, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 7, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 54, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 98, (byte) 2, (byte) 2, (byte) 98, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 98, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 0, (byte) 4, (byte) 0, (byte) 51, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 7, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 0, (byte) 4, (byte) 0, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 0, (byte) 4, (byte) 0, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 40, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 30, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0}, {(byte) 1, (byte) 0, (byte) 7, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 50, (byte) 0, (byte) 50, (byte) 0, (byte) 4, (byte) 0, (byte) 4, (byte) 0, (byte) 4, (byte) 0, (byte) 4, (byte) 0, (byte) 50, (byte) 0, (byte) 0, (byte) 4, (byte) 0, (byte) 4, (byte) 0, (byte) 4, (byte) 0, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 50, (byte) 50, (byte) 50, (byte) 7, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 41, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0}, {(byte) 5, (byte) 5, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0}, {(byte) 6, (byte) 6, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}};
            tco = 0;
            txtype[tco] = 2;
            tyobi(203, 249, 102);
            tyobi(290, 249, 101);
            txtype[tco] = 2;
            tyobi(1421, 249, 114);

            for (t = 0; t >= -7; --t) {
                tyobi(1537, t * 29 - 12, 1);
            }

            txtype[tco] = 1;
            tyobi(2320, 133, 104);
            txtype[tco] = 2;
            tyobi(2262, 133, 102);
            sco = 0;
            t = sco;
            sa[t] = 5800;
            sb[t] = '\u8e94';
            sc[t] = 2999;
            sd[t] = 3000;
            stype[t] = 52;
            ++sco;
            t = sco;
            sa[t] = 69600;
            sb[t] = '\u8e94';
            sc[t] = 2999;
            sd[t] = 3000;
            stype[t] = 52;
            ++sco;
            t = sco;
            sa[t] = 125200;
            sb[t] = -6000;
            sc[t] = 3000;
            sd[t] = 70000;
            stype[t] = 102;
            sxtype[t] = 1;
            ++sco;
            t = sco;
            sa[t] = 154200;
            sb[t] = -6000;
            sc[t] = 3000;
            sd[t] = 70000;
            stype[t] = 102;
            sxtype[t] = 2;
            ++sco;
            t = sco;
            sa[t] = 374100;
            sb[t] = 19100;
            sc[t] = 3000;
            sd[t] = 5800;
            stype[t] = 40;
            sxtype[t] = 2;
            ++sco;
            t = sco;
            sa[t] = 446600;
            sb[t] = 3000;
            sc[t] = 9000;
            sd[t] = 3000;
            stype[t] = 102;
            sxtype[t] = 7;
            ++sco;
            t = 27;
            sa[t] = 200100;
            sb[t] = 1700;
            sc[t] = 17999;
            sd[t] = 3000;
            stype[t] = 51;
            sxtype[t] = 0;
            sgtype[t] = 0;
            ++sco;
            t = 28;
            sa[t] = 191400;
            sb[t] = 1700;
            sc[t] = 8999;
            sd[t] = 3000;
            stype[t] = 51;
            sxtype[t] = 1;
            sgtype[t] = 0;
            ++sco;
            t = 29;
            sa[t] = 191400;
            sb[t] = -7000;
            sc[t] = 26999;
            sd[t] = 3000;
            stype[t] = 51;
            sxtype[t] = 2;
            sgtype[t] = 0;
            ++sco;
            t = 26;
            sa[t] = 297200;
            sb[t] = 22900;
            sc[t] = 3000;
            sd[t] = 3000;
            stype[t] = 180;
            sxtype[t] = 0;
            sr[t] = 0;
            sgtype[t] = 48;
            ++sco;
            t = sco;
            sa[t] = 295800;
            sb[t] = 24900;
            sc[t] = 6000;
            sd[t] = 11800;
            stype[t] = 50;
            sxtype[t] = 2;
            ++sco;
            t = sco;
            sa[t] = 356700;
            sb[t] = 24900;
            sc[t] = 14999;
            sd[t] = 15000;
            stype[t] = 52;
            sxtype[t] = 1;
            ++sco;
            t = sco;
            sa[t] = 381000;
            sb[t] = 1700;
            sc[t] = 4700;
            sd[t] = 23300;
            stype[t] = 1;
            sxtype[t] = 0;
            ++sco;
            t = sco;
            sa[t] = 414700;
            sb[t] = 24900;
            sc[t] = 6000;
            sd[t] = 11800;
            stype[t] = 50;
            sxtype[t] = 5;
            ++sco;
            t = sco;
            sa[t] = 429200;
            sb[t] = 24900;
            sc[t] = 6000;
            sd[t] = 11800;
            stype[t] = 50;
            sxtype[t] = 5;
            ++sco;
            t = sco;
            sa[t] = 443700;
            sb[t] = 24900;
            sc[t] = 6000;
            sd[t] = 11800;
            stype[t] = 50;
            sxtype[t] = 5;
            ++sco;
            bco = 0;
            t = bco;
            ba[t] = '\ucbe8';
            bb[t] = 27800;
            btype[t] = 82;
            bxtype[t] = 1;
            ++bco;
            t = bco;
            ba[t] = 148900;
            bb[t] = 5600;
            btype[t] = 80;
            bxtype[t] = 1;
            ++bco;
            t = bco;
            ba[t] = 278500;
            bb[t] = 27800;
            btype[t] = 105;
            bxtype[t] = 0;
            ++bco;
            srco = 0;
            t = srco;
            sra[t] = 321900;
            srb[t] = 22000;
            src[t] = 9000;
            srtype[t] = 0;
            sracttype[t] = 5;
            sre[t] = -300;
            ++srco;
            t = srco;
            sra[t] = 321900;
            srb[t] = -1200;
            src[t] = 9000;
            srtype[t] = 0;
            sracttype[t] = 5;
            sre[t] = -300;
            ++srco;
            t = 10;
            sra[t] = 336400;
            srb[t] = 10400;
            src[t] = 9000;
            srtype[t] = 1;
            sracttype[t] = 5;
            sre[t] = 300;
            ++srco;
            t = 11;
            sra[t] = 336400;
            srb[t] = '\u8340';
            src[t] = 9000;
            srtype[t] = 1;
            sracttype[t] = 5;
            sre[t] = 300;
            ++srco;

            for (tt = 0; tt <= 1000; ++tt) {
                for (t = 0; t <= 16; ++t) {
                    stagedate[t][tt] = 0;
                }
            }

            for (t = 0; t < stagedatex.length; ++t) {
                for (tt = 0; tt < stagedatex[t].length; ++tt) {
                    stagedate[t][tt] = stagedatex[t][tt];
                }
            }
        }

        if (sta == 1 && stb == 2 && stc == 2) {
            bgmchange(oto[100]);
            scrollx = 90000;
            ma = 7500;
            mb = 27000;
            stagedatex = new byte[][]{{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 82, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 99, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 82, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 83, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 40, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 41, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 81}, {(byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5}, {(byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}};
            t = sco;
            sa[t] = 15000;
            sb[t] = -6000;
            sc[t] = 3000;
            sd[t] = 70000;
            stype[t] = 102;
            sxtype[t] = 8;
            ++sco;
            t = 28;
            sa[t] = 128100;
            sb[t] = 27800;
            sc[t] = 6000;
            sd[t] = 8800;
            stype[t] = 50;
            ++sco;
            bco = 0;
            t = bco;
            ba[t] = '\ud73c';
            bb[t] = 4600;
            btype[t] = 85;
            bxtype[t] = 0;
            ++bco;

            for (tt = 0; tt <= 1000; ++tt) {
                for (t = 0; t <= 16; ++t) {
                    stagedate[t][tt] = 0;
                }
            }

            for (t = 0; t < stagedatex.length; ++t) {
                for (tt = 0; tt < stagedatex[t].length; ++tt) {
                    stagedate[t][tt] = stagedatex[t][tt];
                }
            }
        }

        if (sta == 1 && stb == 3 && stc == 6) {
            stc = 0;
        }

        if (sta == 1 && stb == 3 && stc == 0) {
            bgmchange(oto[100]);
            scrollx = 390000;
            stagedatex = new byte[][]{{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 82, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 84, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 57, (byte) 0, (byte) 0, (byte) 0, (byte) 84, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 84, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 54, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 82, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 84, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 51, (byte) 0, (byte) 0, (byte) 0, (byte) 84, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 99, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 82, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 57, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 58, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 56, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 30, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 7, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 84, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 83, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 84, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 83, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 30, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 85, (byte) 85, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 97, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 81, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 81, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 81, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 81, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 50, (byte) 0, (byte) 50, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 4, (byte) 4, (byte) 4, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 81, (byte) 0, (byte) 0, (byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}};
            tco = 0;
            tyobi(638, 75, 1);
            tyobi(1566, 249, 116);
            tyobi(522, 394, 117);
            tyobi(551, 394, 117);
            tyobi(580, 394, 117);
            txtype[tco] = 1;
            tyobi(1769, 249, 101);
            tyobi(2146, 249, 7);
            txtype[tco] = 2;
            tyobi(812, 249, 300);
            txtype[tco] = 3;
            tyobi(203, 249, 101);
            txtype[tco] = 4;
            tyobi(2030, 220, 300);
            txtype[tco] = 1;
            tyobi(1682, 365, 115);
            txtype[tco] = 1;
            tyobi(1711, 365, 115);
            txtype[tco] = 1;
            tyobi(1740, 365, 115);
            txtype[tco] = 0;
            tyobi(3219, 162, 301);
            txtype[tco] = 0;
            tyobi(3306, 249, 120);
            bco = 0;
            t = bco;
            ba[t] = 292900;
            bb[t] = 13300;
            btype[t] = 4;
            bxtype[t] = 1;
            ++bco;
            t = bco;
            ba[t] = 423400;
            bb[t] = 27800;
            btype[t] = 6;
            bxtype[t] = 1;
            ++bco;
            t = sco;
            sa[t] = 26100;
            sb[t] = '\u8e94';
            sc[t] = 8999;
            sd[t] = 3000;
            stype[t] = 52;
            ++sco;
            t = sco;
            sa[t] = 189000;
            sb[t] = 27800;
            sc[t] = 6000;
            sd[t] = 8800;
            stype[t] = 50;
            sxtype[t] = 1;
            ++sco;
            t = sco;
            sa[t] = 214600;
            sb[t] = 20500;
            sc[t] = 6000;
            sd[t] = 3000;
            stype[t] = 103;
            sxtype[t] = 1;
            ++sco;
            t = sco;
            sa[t] = 275400;
            sb[t] = -6000;
            sc[t] = 9000;
            sd[t] = 70000;
            stype[t] = 102;
            sxtype[t] = 10;
            ++sco;
            t = sco;
            sa[t] = 378400;
            sb[t] = -1300;
            sc[t] = 15000;
            sd[t] = 14000;
            stype[t] = 104;
            ++sco;
            t = bco;
            ba[t] = 29100;
            bb[t] = 30700;
            btype[t] = 105;
            bxtype[t] = 1;
            ++bco;
            t = bco;
            ba[t] = 124700;
            bb[t] = 30700;
            btype[t] = 82;
            bxtype[t] = 1;
            ++bco;
            t = bco;
            ba[t] = 2900;
            bb[t] = 4600;
            btype[t] = 80;
            bxtype[t] = 0;
            ++bco;
            srco = 0;
            t = srco;
            sra[t] = 95700;
            srb[t] = 7500;
            src[t] = 9000;
            srtype[t] = 0;
            sracttype[t] = 0;
            sre[t] = 0;
            srsp[t] = 1;
            ++srco;
            t = srco;
            sra[t] = 111100;
            srb[t] = 16200;
            src[t] = 9000;
            srtype[t] = 0;
            sracttype[t] = 1;
            sre[t] = 0;
            ++srco;
            t = srco;
            sra[t] = 132000;
            srb[t] = 27800;
            src[t] = 9000;
            srtype[t] = 0;
            sracttype[t] = 0;
            sre[t] = 0;
            srsp[t] = 2;
            ++srco;
            t = srco;
            sra[t] = 275500;
            srb[t] = 19100;
            src[t] = 18000;
            srtype[t] = 0;
            sracttype[t] = 0;
            sre[t] = 0;
            srsp[t] = 10;
            ++srco;
            t = srco;
            sra[t] = 301600;
            srb[t] = 24900;
            src[t] = 9000;
            srtype[t] = 0;
            sracttype[t] = 0;
            sre[t] = 0;
            srsp[t] = 12;
            ++srco;
            t = srco;
            sra[t] = 339300;
            srb[t] = 7500;
            src[t] = 9000;
            srtype[t] = 0;
            sracttype[t] = 1;
            sre[t] = 0;
            srsp[t] = 15;
            ++srco;
            t = srco;
            sra[t] = 359600;
            srb[t] = 13300;
            src[t] = 21000;
            srtype[t] = 0;
            sracttype[t] = 0;
            sre[t] = 0;
            srsp[t] = 10;
            ++srco;
            if (stagepoint == 1) {
                stagepoint = 0;
                ma = 4500;
                mb = -3000;
                tyuukan = 0;
            }

            for (tt = 0; tt <= 1000; ++tt) {
                for (t = 0; t <= 16; ++t) {
                    stagedate[t][tt] = 0;
                }
            }

            for (t = 0; t < stagedatex.length; ++t) {
                for (tt = 0; tt < stagedatex[t].length; ++tt) {
                    stagedate[t][tt] = stagedatex[t][tt];
                }
            }
        }

        if (sta == 1 && stb == 3 && stc == 1) {
            bgmchange(oto[103]);
            scrollx = 0;
            ma = 6000;
            mb = 6000;
            stagecolor = 2;
            stagedatex = new byte[][]{{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0}, {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0}, {(byte) 1, (byte) 54, (byte) 0, (byte) 54, (byte) 0, (byte) 54, (byte) 0, (byte) 54, (byte) 0, (byte) 54, (byte) 0, (byte) 54, (byte) 0, (byte) 54, (byte) 0, (byte) 54, (byte) 1, (byte) 0}, {(byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 1, (byte) 8, (byte) 8, (byte) 8, (byte) 8}, {(byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}};
            tco = 0;
            stc = 0;

            for (tt = 0; tt <= 1000; ++tt) {
                for (t = 0; t <= 16; ++t) {
                    stagedate[t][tt] = 0;
                }
            }

            for (t = 0; t < stagedatex.length; ++t) {
                for (tt = 0; tt < stagedatex[t].length; ++tt) {
                    stagedate[t][tt] = stagedatex[t][tt];
                }
            }
        }

        if (sta == 1 && stb == 3 && stc == 5) {
            stagecolor = 3;
            bgmchange(oto[104]);
            scrollx = 0;
            ma = 3000;
            mb = '\u80e8';
            stagepoint = 1;
            stagedatex = new byte[][]{{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 9, (byte) 0, (byte) 9, (byte) 0, (byte) 9, (byte) 0, (byte) 9, (byte) 0, (byte) 9, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 9, (byte) 0, (byte) 9, (byte) 0, (byte) 9, (byte) 0, (byte) 9, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 9, (byte) 0, (byte) 9, (byte) 0, (byte) 9, (byte) 0, (byte) 9, (byte) 0, (byte) 9, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 8, (byte) 8, (byte) 8, (byte) 8, (byte) 8, (byte) 8, (byte) 8, (byte) 8, (byte) 8, (byte) 8, (byte) 8, (byte) 8, (byte) 8, (byte) 8, (byte) 0, (byte) 0, (byte) 8, (byte) 8, (byte) 8, (byte) 8, (byte) 8}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}};
            sco = 0;
            t = sco;
            sa[t] = '\u9e93';
            sb[t] = 30700;
            sc[t] = 6000;
            sd[t] = 14800;
            stype[t] = 50;
            sxtype[t] = 1;
            ++sco;
            txtype[tco] = 0;
            tyobi(348, 104, 112);
            txtype[tco] = 3;
            tyobi(348, 220, 300);

            for (tt = 0; tt <= 1000; ++tt) {
                for (t = 0; t <= 16; ++t) {
                    stagedate[t][tt] = 0;
                }
            }

            for (t = 0; t < stagedatex.length; ++t) {
                for (tt = 0; tt < stagedatex[t].length; ++tt) {
                    stagedate[t][tt] = stagedatex[t][tt];
                }
            }
        }

        stagep3();
    }

    void stagep3() {
        if (sta == 1 && stb == 4 && stc == 0) {
            bgmchange(oto[105]);
            scrollx = 440000;
            ma = 12000;
            mb = 6000;
            stagecolor = 4;
            stagedatex = new byte[][]{{(byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 60, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 60, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 60, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 60, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 60, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 50, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 60, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 3, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 30, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 60, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 7, (byte) 0, (byte) 0, (byte) 0, (byte) 60, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 7, (byte) 7, (byte) 2, (byte) 2, (byte) 7, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 3, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 59, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 59, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 59, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 40, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 41, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 86, (byte) 0, (byte) 0, (byte) 86, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 86, (byte) 0, (byte) 0, (byte) 86, (byte) 0, (byte) 0, (byte) 86, (byte) 0, (byte) 0, (byte) 86, (byte) 0, (byte) 0, (byte) 86, (byte) 0, (byte) 0, (byte) 86, (byte) 0, (byte) 0, (byte) 86, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 86, (byte) 0, (byte) 0, (byte) 86, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 86, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 86, (byte) 0, (byte) 0, (byte) 86, (byte) 0, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 86, (byte) 0, (byte) 0, (byte) 86, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 86, (byte) 0, (byte) 0, (byte) 86, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 86, (byte) 0, (byte) 5, (byte) 5, (byte) 86, (byte) 0, (byte) 0, (byte) 86, (byte) 0, (byte) 0, (byte) 86, (byte) 0, (byte) 0, (byte) 86, (byte) 0, (byte) 0, (byte) 86, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 41, (byte) 0, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 5, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}};
            sco = 0;
            t = sco;
            sa[t] = 100750;
            sb[t] = 20500;
            sc[t] = 1500;
            sd[t] = 3000;
            stype[t] = 105;
            ++sco;
            t = sco;
            sa[t] = 194300;
            sb[t] = 10400;
            sc[t] = 8999;
            sd[t] = 2999;
            stype[t] = 51;
            sxtype[t] = 3;
            sgtype[t] = 0;
            ++sco;
            t = sco;
            sa[t] = 211700;
            sb[t] = '\u8e94';
            sc[t] = 2999;
            sd[t] = 3000;
            stype[t] = 52;
            ++sco;
            t = sco;
            sa[t] = 356700;
            sb[t] = 1700;
            sc[t] = 17999;
            sd[t] = 2800;
            stype[t] = 51;
            sxtype[t] = 10;
            ++sco;
            t = sco;
            sa[t] = 362600;
            sb[t] = 4600;
            sc[t] = 2999;
            sd[t] = 300000;
            stype[t] = 102;
            sxtype[t] = 20;
            ++sco;
            t = sco;
            sa[t] = 430200;
            sb[t] = -36000;
            sc[t] = 2999;
            sd[t] = 300000;
            stype[t] = 102;
            sxtype[t] = 30;
            ++sco;
            t = sco;
            sa[t] = 291000;
            sb[t] = -6000;
            sc[t] = 3000;
            sd[t] = 70000;
            stype[t] = 102;
            sxtype[t] = 12;
            ++sco;
            t = sco;
            sa[t] = 0;
            sb[t] = 27800;
            sc[t] = 20999;
            sd[t] = 14999;
            stype[t] = 200;
            sxtype[t] = 0;
            ++sco;
            t = sco;
            sa[t] = 31900;
            sb[t] = -1200;
            sc[t] = 23999;
            sd[t] = 11999;
            stype[t] = 200;
            sxtype[t] = 0;
            ++sco;
            bco = 0;
            t = bco;
            ba[t] = 21800;
            bb[t] = 5100;
            btype[t] = 86;
            bxtype[t] = 0;
            ++bco;
            t = bco;
            ba[t] = 120400;
            bb[t] = -6500;
            btype[t] = 86;
            bxtype[t] = 0;
            ++bco;
            t = bco;
            ba[t] = 85600;
            bb[t] = 20600;
            btype[t] = 87;
            bxtype[t] = 105;
            ++bco;
            t = bco;
            ba[t] = 137800;
            bb[t] = 26400;
            btype[t] = 87;
            bxtype[t] = 110;
            ++bco;
            t = bco;
            ba[t] = 204500;
            bb[t] = 26400;
            btype[t] = 87;
            bxtype[t] = 105;
            ++bco;
            t = bco;
            ba[t] = 192901;
            bb[t] = 11900;
            btype[t] = 87;
            bxtype[t] = 101;
            ++bco;
            t = bco;
            ba[t] = 248001;
            bb[t] = 11900;
            btype[t] = 87;
            bxtype[t] = 105;
            ++bco;
            t = bco;
            ba[t] = 165300;
            bb[t] = 5100;
            btype[t] = 80;
            bxtype[t] = 1;
            ++bco;
            t = bco;
            ba[t] = 223300;
            bb[t] = 13300;
            btype[t] = 82;
            bxtype[t] = 2;
            ++bco;
            t = bco;
            ba[t] = 377000;
            bb[t] = 22000;
            btype[t] = 30;
            bxtype[t] = 0;
            ++bco;
            t = bco;
            ba[t] = 411800;
            bb[t] = 27800;
            btype[t] = 31;
            bxtype[t] = 0;
            ++bco;
            nco = 0;
            na[nco] = 20000;
            nb[nco] = '\u99e8';
            ntype[nco] = 6;
            ++nco;
            if (nco >= nmax) {
                nco = 0;
            }

            na[nco] = 118600;
            nb[nco] = '\u99e8';
            ntype[nco] = 6;
            ++nco;
            if (nco >= nmax) {
                nco = 0;
            }

            na[nco] = 431000;
            nb[nco] = 28400;
            ntype[nco] = 100;
            ++nco;
            if (nco >= nmax) {
                nco = 0;
            }

            tco = 0;
            txtype[tco] = 1;
            tyobi(841, 75, 130);
            tyobi(986, 249, 5);
            tyobi(1015, 249, 5);
            tyobi(1610, 162, 7);
            txtype[tco] = 10;
            tyobi(1450, 249, 114);
            txtype[tco] = 5;
            tyobi(29, 133, 300);
            txtype[tco] = 3;
            tyobi(2494, 249, 101);
            txtype[tco] = 2;
            tyobi(2494, 162, 117);

            for (t = 0; t <= 2; ++t) {
                txtype[tco] = 3;
                tyobi((79 + t) * 29, 365, 115);
            }

            txtype[tco] = 3;
            tyobi(3045, 307, 120);
            txtype[tco] = 3;
            tyobi(3161, 191, 102);
            txtype[tco] = 4;
            tyobi(3219, 191, 101);
            tyobi(3828, 217, 140);
            tyobi(3799, 249, 141);
            tyobi(4669, 336, 142);
            tyobi(1914, 104, 124);
            srco = 0;
            t = srco;
            sra[t] = 269700;
            srb[t] = 27800;
            src[t] = 6000;
            srtype[t] = 0;
            sracttype[t] = 1;
            sre[t] = 0;
            ++srco;
            t = 20;
            sra[t] = 345400;
            srb[t] = 27800;
            src[t] = '\u9088';
            srtype[t] = 0;
            sracttype[t] = 0;
            srsp[t] = 21;
            sre[t] = 0;
            ++srco;
            stc = 0;

            for (tt = 0; tt <= 1000; ++tt) {
                for (t = 0; t < 16; ++t) {
                    stagedate[t][tt] = 0;
                }
            }

            for (t = 0; t < stagedatex.length; ++t) {
                for (tt = 0; tt < stagedatex[t].length; ++tt) {
                    stagedate[t][tt] = stagedatex[t][tt];
                }
            }
        }

    }

    void bgmchange(AudioClip var1) {
        oto[0] = null;
        oto[0] = var1;
    }

    void tyobi(int var1, int var2, int var3) {
        ta[tco] = var1 * 100;
        tb[tco] = var2 * 100;
        ttype[tco] = var3;
        ++tco;
        if (tco >= tmax) {
            tco = 0;
        }

    }

    void brockbreak(int var1) {
        if (titem[var1] == 1) {
            ;
        }

        if (titem[var1] >= 2 && titem[var1] <= 7) {
            ;
        }

        ta[var1] = -800000;
    }

    void ttmsg() {
        xx[1] = 60;
        xx[2] = 40;
        if (tmsgtype == 1 || tmsgtype == 2) {
            setc0();
            fillrect(xx[1], xx[2], 360, tmsgy / 100);
            setc1();
            drawrect(xx[1], xx[2], 360, tmsgy / 100);
        }

        if (tmsgtype == 2) {
            setfont(20, 5);
            if (tmsg == 0) {
                setc1();
                setfont(20, 5);
                txmsg("テスト　hoge", 0);
            }

            if (tmsg == 1) {
                setc1();
                txmsg("", 0);
                txmsg("ステージ 1 より", 0);
                txmsg("特殊的なものが増えたので", 1);
                txmsg("気をつけてくれよ～", 2);
                txmsg("後、アイテムの一部を利用するかも…", 4);
                txmsg("                       ちく より", 6);
            }

            if (tmsg == 2) {
                txmsg("            ？が必要です ", 3);
                txmsg("                         m9(^Д^)", 6);
            }

            if (tmsg == 3) {
                txmsg("   別にコインに意味ないけどね ", 3);
                txmsg("                      (・ω・ )ﾉｼ", 6);
            }

            if (tmsg == 4) {
                txmsg("この先に隠しブロックがあります ", 2);
                txmsg("注意してください !!", 4);
            }

            if (tmsg == 5) {
                txmsg("", 0);
                txmsg(" 前回よりも難易度を下げましたので", 1);
                txmsg(" 気楽にプレイしてください    ", 3);
                txmsg("                       ちく より", 6);
            }

            if (tmsg == 80) {
                txmsg("そんな容易に", 1);
                txmsg("ヒントに頼るもんじゃないぜ", 2);
                txmsg("ほら、さっさと次行きな!!", 5);
            }

            if (tmsg == 100) {
                txmsg("え？私ですか？ ", 0);
                txmsg("いやぁ、ただの通りすがりの", 2);
                txmsg("ヒントブロックですよ～", 3);
                txmsg("決して怪しいブロックじゃないですよ", 5);
                txmsg("                          (…チッ)", 6);
            }

            setfont(20, 6);
        }

        if (tmsgtype == 3) {
            xx[5] = 183 - tmsgy / 100;
            if (xx[5] > 0) {
                setc0();
                fillrect(xx[1], xx[2] + tmsgy / 100, 360, xx[5]);
                setc1();
                drawrect(xx[1], xx[2] + tmsgy / 100, 360, xx[5]);
            }
        }

    }

    void txmsg(String var1, int var2) {
        byte var3 = 6;
        str(var1, 60 + var3, 40 + var3 + var2 * 24);
    }

    void setfont(int var1, int var2) {
        Font var3 = new Font("Serif", 1, 18);
        h.setFont(var3);
    }

    void eyobi(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        ea[eco] = var1;
        eb[eco] = var2;
        ec[eco] = var3;
        ed[eco] = var4;
        ee[eco] = var5;
        ef[eco] = var6;
        egtype[eco] = var9;
        etm[eco] = var10;
        enobia[eco] = var7;
        enobib[eco] = var8;
        ++eco;
        if (eco >= emax) {
            eco = 0;
        }

    }

    void ayobi(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = 0;

        for (t1 = 0; t1 <= 1; ++t1) {
            t1 = 2;
            if (aa[aco] >= -9000 && aa[aco] <= 30000) {
                t1 = 0;
            }

            ++var8;
            if (var8 <= amax) {
                t1 = 3;
                ad[aco] = xx[1];
                aa[aco] = var1;
                ab[aco] = var2;
                ac[aco] = var3;
                ad[aco] = var4;
                if (var7 > 100) {
                    ac[aco] = var7;
                }

                atype[aco] = var6;
                if (var7 >= 0 && var7 <= 99100) {
                    axtype[aco] = var7;
                }

                anotm[aco] = var5;
                if (aa[aco] - fx <= ma + mnobia / 2) {
                    amuki[aco] = 1;
                }

                if (aa[aco] - fx > ma + mnobia / 2) {
                    amuki[aco] = 0;
                }

                if (abrocktm[aco] >= 1) {
                    amuki[aco] = 1;
                }

                if (abrocktm[aco] == 20) {
                    amuki[aco] = 0;
                }

                anobia[aco] = anx[atype[aco]];
                anobib[aco] = any[atype[aco]];
                if (var6 == 7) {
                    ot(oto[10]);
                }

                if (var6 == 10 && CheckSoundMem(oto[18]) == 0) {
                    ot(oto[18]);
                }

                azimentype[aco] = 1;
                if (var6 == 87) {
                    atm[aco] = rand(179) + -90;
                }

                ++aco;
                if (aco >= amax - 1) {
                    aco = 0;
                }
            }
        }

    }

    int CheckSoundMem(AudioClip var1) {
        return 1000;
    }

    void StopSoundMem(AudioClip var1) {
        try {
            var1.stop();
        } catch (Exception var3) {
            ;
        }

    }

    void PlaySoundMem(AudioClip var1) {
        try {
            var1.loop();
        } catch (Exception var3) {
            ;
        }

    }

    AudioClip LoadSoundMem(String var1) {
        return getAudioClip(getCodeBase(), var1);
    }

    Image DerivationGraph(int var1, int var2, int var3, int var4, Image var5) {
        wkp = null;
        wkp = createImage(var3, var4);
        wkg = wkp.getGraphics();
        wkg.drawImage(var5, 0, 0, 0 + var3, 0 + var4, var1, var2, var1 + var3, var2 + var4, this);
        mt.addImage(wkp, 0);

        try {
            mt.waitForAll();
        } catch (InterruptedException var12) {
            ;
        }

        PixelGrabber var6 = new PixelGrabber(wkp, 0, 0, -1, -1, true);

        try {
            var6.grabPixels();
        } catch (InterruptedException var11) {
            ;
        }

        int[] var7 = (int[]) var6.getPixels();

        for (int var8 = 0; var8 < var7.length; ++var8) {
            if (var7[var8] == -6684673) {
                var7[var8] = 16777215;
            }
        }

        MemoryImageSource var13 = new MemoryImageSource(var6.getWidth(), var6.getHeight(), var7, 0, var6.getWidth());
        wkp = createImage(var13);
        mt.addImage(wkp, 10);

        try {
            mt.waitForID(10);
        } catch (Exception var10) {
            ;
        }

        return wkp;
    }

}
