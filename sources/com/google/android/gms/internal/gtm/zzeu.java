package com.google.android.gms.internal.gtm;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ch.qos.logback.core.spi.ComponentTracker;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzeu {
    public static final zzet<Integer> zzA;
    public static final zzet<String> zzB;
    public static final zzet<Integer> zzC;
    public static final zzet<Long> zzD;
    public static final zzet<Integer> zzE;
    public static final zzet<Integer> zzF;
    public static final zzet<Long> zzG;
    public static final zzet<String> zzH;
    public static final zzet<Integer> zzI;
    public static final zzet<Boolean> zzJ;
    public static final zzet<Long> zzK;
    public static final zzet<Long> zzL;
    public static final zzet<Long> zzM;
    public static final zzet<Long> zzN;
    public static final zzet<Long> zzO;
    public static final zzet<Long> zzP;
    public static final zzet<Long> zzQ;
    public static final zzet<Boolean> zzR;
    private static final Set<zzet<?>> zzS = Collections.synchronizedSet(new HashSet());
    public static final zzet<Boolean> zza;
    public static final zzet<Boolean> zzb;
    public static final zzet<String> zzc;
    public static final zzet<Long> zzd;
    public static final zzet<Double> zze;
    public static final zzet<Integer> zzf;
    public static final zzet<Integer> zzg;
    public static final zzet<Integer> zzh;
    public static final zzet<Long> zzi;
    public static final zzet<Long> zzj;
    public static final zzet<Long> zzk;
    public static final zzet<Long> zzl;
    public static final zzet<Long> zzm;
    public static final zzet<Long> zzn;
    public static final zzet<Integer> zzo;
    public static final zzet<Integer> zzp;
    public static final zzet<String> zzq;
    public static final zzet<String> zzr;
    public static final zzet<String> zzs;
    public static final zzet<String> zzt;
    public static final zzet<Integer> zzu;
    public static final zzet<String> zzv;
    public static final zzet<String> zzw;
    public static final zzet<Integer> zzx;
    public static final zzet<Integer> zzy;
    public static final zzet<Integer> zzz;

    static {
        Boolean bool = Boolean.FALSE;
        zza = zzet.zza(bool, bool, new zzes() { // from class: com.google.android.gms.internal.gtm.zzda
        });
        Boolean bool2 = Boolean.TRUE;
        zzb = zzet.zza(bool2, bool2, new zzes() { // from class: com.google.android.gms.internal.gtm.zzdl
        });
        zzc = zzet.zza("GAv4", "GAv4-SVC", new zzes() { // from class: com.google.android.gms.internal.gtm.zzdd
        });
        zzd = zzet.zza(60L, 60L, new zzes() { // from class: com.google.android.gms.internal.gtm.zzdp
        });
        Double valueOf = Double.valueOf(0.5d);
        zze = zzet.zza(valueOf, valueOf, new zzes() { // from class: com.google.android.gms.internal.gtm.zzeb
        });
        zzf = zzet.zza(2000, Integer.valueOf((int) Level.INFO_INT), new zzes() { // from class: com.google.android.gms.internal.gtm.zzeg
        });
        zzg = zzet.zza(2000, 2000, new zzes() { // from class: com.google.android.gms.internal.gtm.zzei
        });
        zzh = zzet.zza(100, 100, new zzes() { // from class: com.google.android.gms.internal.gtm.zzej
        });
        Long valueOf2 = Long.valueOf((long) ComponentTracker.DEFAULT_TIMEOUT);
        zzi = zzet.zza(valueOf2, 120000L, new zzes() { // from class: com.google.android.gms.internal.gtm.zzek
        });
        zzj = zzet.zza(5000L, 5000L, new zzes() { // from class: com.google.android.gms.internal.gtm.zzel
        });
        zzk = zzet.zza(120000L, 120000L, new zzes() { // from class: com.google.android.gms.internal.gtm.zzdw
        });
        zzl = zzet.zza(7200000L, 7200000L, new zzes() { // from class: com.google.android.gms.internal.gtm.zzeh
        });
        zzm = zzet.zza(7200000L, 7200000L, new zzes() { // from class: com.google.android.gms.internal.gtm.zzem
        });
        zzn = zzet.zza(32400000L, 32400000L, new zzes() { // from class: com.google.android.gms.internal.gtm.zzen
        });
        zzo = zzet.zza(20, 20, new zzes() { // from class: com.google.android.gms.internal.gtm.zzeo
        });
        zzp = zzet.zza(20, 20, new zzes() { // from class: com.google.android.gms.internal.gtm.zzep
        });
        zzq = zzet.zza("http://www.google-analytics.com", "http://www.google-analytics.com", new zzes() { // from class: com.google.android.gms.internal.gtm.zzeq
        });
        zzr = zzet.zza("https://ssl.google-analytics.com", "https://ssl.google-analytics.com", new zzes() { // from class: com.google.android.gms.internal.gtm.zzer
        });
        zzs = zzet.zza("/collect", "/collect", new zzes() { // from class: com.google.android.gms.internal.gtm.zzdb
        });
        zzt = zzet.zza("/batch", "/batch", new zzes() { // from class: com.google.android.gms.internal.gtm.zzdc
        });
        zzu = zzet.zza(2036, 2036, new zzes() { // from class: com.google.android.gms.internal.gtm.zzde
        });
        zzv = zzet.zza("BATCH_BY_COUNT", "BATCH_BY_COUNT", new zzes() { // from class: com.google.android.gms.internal.gtm.zzdf
        });
        zzw = zzet.zza("GZIP", "GZIP", new zzes() { // from class: com.google.android.gms.internal.gtm.zzdg
        });
        zzx = zzet.zza(20, 20, new zzes() { // from class: com.google.android.gms.internal.gtm.zzdh
        });
        zzy = zzet.zza(8192, 8192, new zzes() { // from class: com.google.android.gms.internal.gtm.zzdi
        });
        zzz = zzet.zza(8192, 8192, new zzes() { // from class: com.google.android.gms.internal.gtm.zzdj
        });
        zzA = zzet.zza(8192, 8192, new zzes() { // from class: com.google.android.gms.internal.gtm.zzdk
        });
        zzB = zzet.zza("404,502", "404,502", new zzes() { // from class: com.google.android.gms.internal.gtm.zzdm
        });
        zzC = zzet.zza(3600, 3600, new zzes() { // from class: com.google.android.gms.internal.gtm.zzdn
        });
        Long valueOf3 = Long.valueOf((long) CoreConstants.MILLIS_IN_ONE_DAY);
        zzD = zzet.zza(valueOf3, valueOf3, new zzes() { // from class: com.google.android.gms.internal.gtm.zzdo
        });
        zzE = zzet.zza(60000, 60000, new zzes() { // from class: com.google.android.gms.internal.gtm.zzdq
        });
        zzF = zzet.zza(61000, 61000, new zzes() { // from class: com.google.android.gms.internal.gtm.zzdr
        });
        zzG = zzet.zza(valueOf3, valueOf3, new zzes() { // from class: com.google.android.gms.internal.gtm.zzds
        });
        zzH = zzet.zza("", "", new zzes() { // from class: com.google.android.gms.internal.gtm.zzdt
        });
        zzI = zzet.zza(0, 0, new zzes() { // from class: com.google.android.gms.internal.gtm.zzdu
        });
        zzJ = zzet.zza(bool, bool, new zzes() { // from class: com.google.android.gms.internal.gtm.zzdv
        });
        Long valueOf4 = Long.valueOf((long) AbstractComponentTracker.LINGERING_TIMEOUT);
        zzK = zzet.zza(valueOf4, valueOf4, new zzes() { // from class: com.google.android.gms.internal.gtm.zzdx
        });
        zzL = zzet.zza(5000L, 5000L, new zzes() { // from class: com.google.android.gms.internal.gtm.zzdy
        });
        zzM = zzet.zza(5000L, 5000L, new zzes() { // from class: com.google.android.gms.internal.gtm.zzdz
        });
        zzN = zzet.zza(60000L, 60000L, new zzes() { // from class: com.google.android.gms.internal.gtm.zzea
        });
        zzO = zzet.zza(valueOf2, valueOf2, new zzes() { // from class: com.google.android.gms.internal.gtm.zzec
        });
        zzP = zzet.zza(valueOf3, valueOf3, new zzes() { // from class: com.google.android.gms.internal.gtm.zzed
        });
        zzQ = zzet.zza(5000L, 5000L, new zzes() { // from class: com.google.android.gms.internal.gtm.zzee
        });
        zzR = zzet.zza(bool, bool, new zzes() { // from class: com.google.android.gms.internal.gtm.zzef
        });
    }
}
