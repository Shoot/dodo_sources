package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.CoreConstants;
import com.appsflyer.AFLogger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class AFa1xSDK {
    private static int AFInAppEventParameterName = 0;
    private static char[] AFInAppEventType = null;
    private static char AFKeystoreWrapper = 0;
    private static int AFLogger = 1;
    private static int afDebugLog;
    private static short[] afErrorLog;
    private static byte[] afInfoLog;
    private static int valueOf;
    private static int values;

    static {
        AFKeystoreWrapper();
        ViewConfiguration.getTouchSlop();
        Color.argb(0, 0, 0, 0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        KeyEvent.getDeadChar(0, 0);
        ViewConfiguration.getMinimumFlingVelocity();
        ViewConfiguration.getLongPressTimeout();
        SystemClock.elapsedRealtime();
        View.getDefaultSize(0, 0);
        ViewConfiguration.getMaximumFlingVelocity();
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getZoomControlsTimeout();
        SystemClock.elapsedRealtime();
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getScrollBarFadeDuration();
        Color.argb(0, 0, 0, 0);
        TextUtils.indexOf("", "");
        ViewConfiguration.getScrollBarSize();
        ViewConfiguration.getJumpTapTimeout();
        Color.rgb(0, 0, 0);
        TypedValue.complexToFloat(0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        ViewConfiguration.getGlobalActionKeyTimeout();
        TextUtils.lastIndexOf("", '0');
        View.combineMeasuredStates(0, 0);
        MotionEvent.axisFromString("");
        TextUtils.getOffsetAfter("", 0);
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getKeyRepeatTimeout();
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getKeyRepeatTimeout();
        View.combineMeasuredStates(0, 0);
        View.resolveSizeAndState(0, 0, 0);
        Color.argb(0, 0, 0, 0);
        int i = AFLogger + 107;
        afDebugLog = i % 128;
        int i2 = i % 2;
    }

    private static boolean AFInAppEventParameterName(String str) {
        int i = afDebugLog + 55;
        AFLogger = i % 128;
        try {
            if (i % 2 == 0) {
                Class.forName(str);
                return false;
            }
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException e) {
            Object[] objArr = new Object[1];
            AFKeystoreWrapper(Color.red(0) - 79, (-1210396294) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) - 23), 696979042 - (Process.myTid() >> 22), (short) (KeyEvent.normalizeMetaState(0) - 74), objArr);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr[0]).intern(), e);
            return false;
        }
    }

    private static String AFInAppEventType(String str, Long l) {
        if (str != null && l != null) {
            int i = afDebugLog + 85;
            AFLogger = i % 128;
            int i2 = i % 2;
            if (str.length() == 32) {
                StringBuilder sb = new StringBuilder(str);
                String obj = l.toString();
                int i3 = 0;
                for (int i4 = 0; i4 < obj.length(); i4++) {
                    int i5 = AFLogger + 31;
                    afDebugLog = i5 % 128;
                    int i6 = i5 % 2;
                    i3 += Character.getNumericValue(obj.charAt(i4));
                }
                String hexString = Integer.toHexString(i3);
                sb.replace(7, hexString.length() + 7, hexString);
                long j = 0;
                int i7 = 0;
                while (i7 < sb.length()) {
                    int i8 = AFLogger + 55;
                    afDebugLog = i8 % 128;
                    if (i8 % 2 != 0) {
                        j %= Character.getNumericValue(sb.charAt(i7));
                        i7 += 101;
                    } else {
                        j += Character.getNumericValue(sb.charAt(i7));
                        i7++;
                    }
                }
                while (j > 100) {
                    int i9 = afDebugLog + 125;
                    AFLogger = i9 % 128;
                    j = i9 % 2 == 0 ? 100 | j : j % 100;
                }
                sb.insert(23, (int) j);
                if (j < 10) {
                    int i10 = AFLogger + 27;
                    afDebugLog = i10 % 128;
                    if (i10 % 2 != 0) {
                        Object[] objArr = new Object[1];
                        values((byte) (7 << ExpandableListView.getPackedPositionGroup(0L)), "㘉", 1 - TextUtils.indexOf("", "", 1, 0), objArr);
                        sb.insert(1, ((String) objArr[0]).intern());
                    } else {
                        Object[] objArr2 = new Object[1];
                        values((byte) (ExpandableListView.getPackedPositionGroup(0L) + 95), "㘉", TextUtils.indexOf("", "", 0, 0) + 1, objArr2);
                        sb.insert(23, ((String) objArr2[0]).intern());
                    }
                }
                return sb.toString();
            }
        }
        Object[] objArr3 = new Object[1];
        AFKeystoreWrapper((-67) - TextUtils.lastIndexOf("", '0', 0, 0), (-1210396326) - KeyEvent.getDeadChar(0, 0), (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 95), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 696979034, (short) (123 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr3);
        String intern = ((String) objArr3[0]).intern();
        int i11 = afDebugLog + 29;
        AFLogger = i11 % 128;
        int i12 = i11 % 2;
        return intern;
    }

    static void AFKeystoreWrapper() {
        AFKeystoreWrapper = (char) 6;
        AFInAppEventType = new char[]{13800, 13749, 13812, 13821, 13817, 13738, 13810, 13788, 13820, 13803, 13783, 13784, 13744, 13822, 13748, 13774, 13814, 13795, 13819, 13746, 13811, 13813, 13754, 13815, 13802, 13823, 13747, 13807, 13806, 13801, 13809, 13766, 13804, 13770, 13739, 13805};
        valueOf = 1210396370;
        values = 98;
        AFInAppEventParameterName = -696978937;
        afInfoLog = new byte[]{21, -78, -76, -78, -41, -78, 11, 25, -78, -27, 18, -78, -46, 102, -78, -78, -78, 29, 18, -19, -30, -83, 71, -18, -22, -91, 80, 19, -25, 24, -91, 24, -26, 88, 19, -55, 3, -29, 21, 22, -50, 36, -28, 21, -27, -26, 35, 49, -38, 29, 58, -39, 33, 52, -42, 52, -42, 51, -41, -26, 31, 60, -26, -45, 35, 54, -48, -23, -22, 48, -23, 33, -24, -26, 36, 105, 90, 57, 42, -7, -113, 54, 50, -15, 100, 46, -114, 51, 69, 102, 10, -125, 45, 24, 53, 30, 34, 7, -2, 98, 40, 10, 63, 8, 39, 10, 50, -17, 95, 48, 47, 54, 35, 43, 38, 3, 89, 110, -6, -10, -10, 101, 57, 88, -64, 103, -86, 49, 0, 1, -2, 109, -11, 110, -49, -87, -97, 12, -73, -49, -122, -4, -53, -52, -55, -72, -48, -71, -38, 7, 11, 90, 13, 87, -56, -111, 8, 21, 67, 101, -5, 89, 79, -121, -122, 82, -104, -60, 61, -54, 59, 56, 65, -40, 16, -25, -57, 65, 55, 55, -59, -62, 26, -34, -12, -57, 62, -51, 60, 59, 66, -37, 51, 125, -120, -52, 59, -46, 111, -120, -52, 51, -47, 112, -117, -59, 61, 66, -58, -125, -108, 55, -58, Byte.MAX_VALUE, -111, -53, 108, -124, -57, -55, 67, 56, 43, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    private static String valueOf(Context context) {
        Properties properties = System.getProperties();
        Object[] objArr = new Object[1];
        AFKeystoreWrapper((-83) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) - 1210396221, (byte) ((-34) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 696979043, (short) ((-48) - Color.blue(0)), objArr);
        boolean containsKey = properties.containsKey(((String) objArr[0]).intern());
        String str = null;
        if (containsKey) {
            int i = afDebugLog + 69;
            AFLogger = i % 128;
            int i2 = i % 2;
            try {
                String path = context.getCacheDir().getPath();
                Object[] objArr2 = new Object[1];
                AFKeystoreWrapper((ViewConfiguration.getFadingEdgeLength() >> 16) - 92, (-1210396208) + View.MeasureSpec.getMode(0), (byte) (((Process.getThreadPriority(0) + 20) >> 6) - 103), 696978985 + TextUtils.lastIndexOf("", '0', 0), (short) (20 - TextUtils.lastIndexOf("", '0')), objArr2);
                String replace = path.replace(((String) objArr2[0]).intern(), "");
                Object[] objArr3 = new Object[1];
                values((byte) (112 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u000f\r\u0007\u0001\u0018\u0011\u0014\r\u000e\u0018", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10, objArr3);
                Matcher matcher = Pattern.compile(((String) objArr3[0]).intern()).matcher(replace);
                if (!(!matcher.find())) {
                    int i3 = AFLogger + 51;
                    afDebugLog = i3 % 128;
                    int i4 = i3 % 2;
                    str = matcher.group(1);
                    int i5 = afDebugLog + 9;
                    AFLogger = i5 % 128;
                    int i6 = i5 % 2;
                }
            } catch (Exception e) {
                Object[] objArr4 = new Object[1];
                values((byte) (86 - MotionEvent.axisFromString("")), "\u0006\u0013\u0016\u000e\u001f\u0013\u001c\"\u0016\u0017\u0001\u001b\"\u001c\u0000\u0016\u0000\n\u001c\u0013\u001e\u0018\u0018\n", 23 - TextUtils.indexOf((CharSequence) "", '0'), objArr4);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr4[0]).intern(), e);
                AFb1uSDK AFInAppEventType2 = AFb1uSDK.AFInAppEventType();
                Object[] objArr5 = new Object[1];
                AFKeystoreWrapper((-81) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-1210396202) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) (View.resolveSize(0, 0) + 61), View.resolveSizeAndState(0, 0, 0) + 696979004, (short) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 2), objArr5);
                String intern = ((String) objArr5[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr6 = new Object[1];
                AFKeystoreWrapper((-57) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.getOffsetAfter("", 0) - 1210396187, (byte) ((-67) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 696979007 - TextUtils.getTrimmedLength(""), (short) (Color.argb(0, 0, 0, 0) + 124), objArr6);
                sb.append(((String) objArr6[0]).intern());
                sb.append(e);
                AFInAppEventType2.values(intern, sb.toString());
                return null;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static String values(Context context, long j) {
        Object obj;
        String intern;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        Object[] objArr = new Object[1];
        values((byte) (97 - MotionEvent.axisFromString("")), "\u0014\u0000\f\u0001\u0016\u0015\u000e\u000f\u001d\u001a\r\u001c\u001e\f\u0014\u0003\f\u000f\r\u001b\r\u001c\u001e\f\u0014\u0003\u0010\u000b\u0014\u0000\u0015\u0000\u0018\u0001", 35 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        try {
            if (AFInAppEventParameterName(((String) objArr[0]).intern())) {
                int i = afDebugLog + 69;
                AFLogger = i % 128;
                if (i % 2 != 0) {
                    Object[] objArr2 = new Object[1];
                    values((byte) (102 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "㘐", -ExpandableListView.getPackedPositionChild(0L), objArr2);
                    obj = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    values((byte) (6 % (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1))), "㘐", -ExpandableListView.getPackedPositionChild(1L), objArr3);
                    intern = ((String) objArr3[0]).intern();
                    sb2.append(intern);
                    sb.append(AFInAppEventType(context, sb2));
                    long j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
                    Object[] objArr4 = new Object[1];
                    AFKeystoreWrapper((-80) - TextUtils.indexOf("", "", 0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1210396371, (byte) ((-16777142) - Color.rgb(0, 0, 0)), 696979058 - ExpandableListView.getPackedPositionGroup(0L), (short) (KeyEvent.normalizeMetaState(0) - 104), objArr4);
                    sb.append(new SimpleDateFormat(((String) objArr4[0]).intern(), Locale.US).format(new Date(j2)));
                    int i2 = afDebugLog + 65;
                    AFLogger = i2 % 128;
                    int i3 = i2 % 2;
                    sb.append(j);
                    values(sb3);
                    return AFInAppEventType(values(values(values(sb.toString()), sb2.toString(), 17), sb3.toString(), 27), Long.valueOf(j));
                }
            } else {
                Object[] objArr5 = new Object[1];
                values((byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 95), "㘉", 1 - (Process.myTid() >> 22), objArr5);
                obj = objArr5[0];
            }
            long j22 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            Object[] objArr42 = new Object[1];
            AFKeystoreWrapper((-80) - TextUtils.indexOf("", "", 0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1210396371, (byte) ((-16777142) - Color.rgb(0, 0, 0)), 696979058 - ExpandableListView.getPackedPositionGroup(0L), (short) (KeyEvent.normalizeMetaState(0) - 104), objArr42);
            sb.append(new SimpleDateFormat(((String) objArr42[0]).intern(), Locale.US).format(new Date(j22)));
            int i22 = afDebugLog + 65;
            AFLogger = i22 % 128;
            int i32 = i22 % 2;
            sb.append(j);
            values(sb3);
            return AFInAppEventType(values(values(values(sb.toString()), sb2.toString(), 17), sb3.toString(), 27), Long.valueOf(j));
        } catch (PackageManager.NameNotFoundException e) {
            Object[] objArr6 = new Object[1];
            AFKeystoreWrapper((-70) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1210396353) - View.resolveSizeAndState(0, 0, 0), (byte) (107 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), View.resolveSize(0, 0) + 696979040, (short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 129), objArr6);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr6[0]).intern(), e);
            Object[] objArr7 = new Object[1];
            AFKeystoreWrapper((-67) - Process.getGidForName(""), (-1210396326) - View.resolveSize(0, 0), (byte) (96 - TextUtils.indexOf("", "", 0)), 696979034 - TextUtils.lastIndexOf("", '0'), (short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 122), objArr7);
            return ((String) objArr7[0]).intern();
        }
        intern = ((String) obj).intern();
        sb2.append(intern);
        sb.append(AFInAppEventType(context, sb2));
    }

    private static String AFKeystoreWrapper(String str) {
        int parseInt;
        int i;
        int i2 = afDebugLog + 1;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            parseInt = Integer.parseInt(str, 5);
            i = 46;
        } else {
            parseInt = Integer.parseInt(str, 2);
            i = 16;
        }
        return Integer.toString(parseInt, i);
    }

    private static String AFInAppEventParameterName(Context context) {
        int i = afDebugLog + 123;
        AFLogger = i % 128;
        int i2 = i % 2;
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            int i3 = afDebugLog + 71;
            AFLogger = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (PackageManager.NameNotFoundException e) {
            Object[] objArr = new Object[1];
            values((byte) ((ViewConfiguration.getTapTimeout() >> 16) + 48), "\u001e\u0015\u0000\"\u0015\u0000\u001f\r\u0003\u0012\u0016\u000b\u0014\u0000\u001a\u000e\u001a\u0018\"\u001c\u0003\u0014\"\u001c\t\u0014\u001a\u0003㘮", View.getDefaultSize(0, 0) + 29, objArr);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr[0]).intern(), e);
            return null;
        }
    }

    private static void AFKeystoreWrapper(int i, int i2, byte b, int i3, short s, Object[] objArr) {
        String obj;
        synchronized (AFf1bSDK.values) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = values;
                int i5 = i + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = afInfoLog;
                    if (bArr != null) {
                        i5 = (byte) (bArr[valueOf + i2] + i4);
                    } else {
                        i5 = (short) (afErrorLog[valueOf + i2] + i4);
                    }
                }
                if (i5 > 0) {
                    AFf1bSDK.AFInAppEventType = ((i2 + i5) - 2) + valueOf + i6;
                    char c = (char) (i3 + AFInAppEventParameterName);
                    AFf1bSDK.valueOf = c;
                    sb.append(c);
                    AFf1bSDK.AFInAppEventParameterName = AFf1bSDK.valueOf;
                    AFf1bSDK.AFKeystoreWrapper = 1;
                    while (AFf1bSDK.AFKeystoreWrapper < i5) {
                        byte[] bArr2 = afInfoLog;
                        if (bArr2 != null) {
                            int i7 = AFf1bSDK.AFInAppEventType;
                            AFf1bSDK.AFInAppEventType = i7 - 1;
                            AFf1bSDK.valueOf = (char) (AFf1bSDK.AFInAppEventParameterName + (((byte) (bArr2[i7] + s)) ^ b));
                        } else {
                            short[] sArr = afErrorLog;
                            int i8 = AFf1bSDK.AFInAppEventType;
                            AFf1bSDK.AFInAppEventType = i8 - 1;
                            AFf1bSDK.valueOf = (char) (AFf1bSDK.AFInAppEventParameterName + (((short) (sArr[i8] + s)) ^ b));
                        }
                        sb.append(AFf1bSDK.valueOf);
                        AFf1bSDK.AFInAppEventParameterName = AFf1bSDK.valueOf;
                        AFf1bSDK.AFKeystoreWrapper++;
                    }
                }
                obj = sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = obj;
    }

    /* loaded from: classes.dex */
    public static class AFa1wSDK extends HashMap<String, Object> {
        private static int AFInAppEventType = 0;
        private static int AFKeystoreWrapper = 0;
        private static short[] AFLogger = null;
        private static int afDebugLog = 0;
        private static char[] afErrorLog = null;
        private static byte[] afInfoLog = null;
        private static long afRDLog = 0;
        private static int afWarnLog = 1;
        private static int values;
        private final Context AFInAppEventParameterName;
        private final Map<String, Object> valueOf;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.appsflyer.internal.AFa1xSDK$AFa1wSDK$AFa1wSDK  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0095AFa1wSDK {
            private static int AFKeystoreWrapper = 0;
            private static char[] valueOf = {24};
            private static int values = 1;

            C0095AFa1wSDK() {
            }

            @NonNull
            private static byte[] AFInAppEventParameterName(@NonNull String str) throws Exception {
                int i = values + 91;
                AFKeystoreWrapper = i % 128;
                int i2 = i % 2;
                byte[] bytes = str.getBytes();
                if (i2 != 0) {
                    int i3 = 18 / 0;
                }
                return bytes;
            }

            @NonNull
            static String values(String str) throws Exception {
                String values2;
                int i = values + 29;
                AFKeystoreWrapper = i % 128;
                int i2 = i % 2;
                byte[] AFInAppEventParameterName = AFInAppEventParameterName(str);
                if (i2 != 0) {
                    values2 = values(AFInAppEventParameterName(AFInAppEventParameterName));
                    int i3 = 97 / 0;
                } else {
                    values2 = values(AFInAppEventParameterName(AFInAppEventParameterName));
                }
                int i4 = AFKeystoreWrapper + 27;
                values = i4 % 128;
                int i5 = i4 % 2;
                return values2;
            }

            private static byte[] AFInAppEventParameterName(@NonNull byte[] bArr) throws Exception {
                int i = 0;
                while (i < bArr.length) {
                    int i2 = AFKeystoreWrapper;
                    int i3 = i2 + 9;
                    values = i3 % 128;
                    int i4 = i3 % 2;
                    bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
                    i++;
                    int i5 = i2 + 17;
                    values = i5 % 128;
                    int i6 = i5 % 2;
                }
                return bArr;
            }

            @NonNull
            private static String values(@NonNull byte[] bArr) throws Exception {
                StringBuilder sb = new StringBuilder();
                int length = bArr.length;
                int i = values + 59;
                AFKeystoreWrapper = i % 128;
                int i2 = i % 2;
                int i3 = 0;
                while (i3 < length) {
                    String hexString = Integer.toHexString(bArr[i3]);
                    if (hexString.length() == 1) {
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr = new Object[1];
                        values(true, new int[]{0, 1, 0, 0}, "\u0000", objArr);
                        sb2.append(((String) objArr[0]).intern());
                        sb2.append(hexString);
                        hexString = sb2.toString();
                    }
                    sb.append(hexString);
                    i3++;
                    int i4 = values + 73;
                    AFKeystoreWrapper = i4 % 128;
                    int i5 = i4 % 2;
                }
                String obj = sb.toString();
                int i6 = values + 15;
                AFKeystoreWrapper = i6 % 128;
                int i7 = i6 % 2;
                return obj;
            }

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r14 = r14;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void values(boolean r12, int[] r13, java.lang.String r14, java.lang.Object[] r15) {
                /*
                    if (r14 == 0) goto L8
                    java.lang.String r0 = "ISO-8859-1"
                    byte[] r14 = r14.getBytes(r0)
                L8:
                    byte[] r14 = (byte[]) r14
                    java.lang.Object r0 = com.appsflyer.internal.AFf1iSDK.valueOf
                    monitor-enter(r0)
                    r1 = 0
                    r2 = r13[r1]     // Catch: java.lang.Throwable -> L38
                    r3 = 1
                    r4 = r13[r3]     // Catch: java.lang.Throwable -> L38
                    r5 = 2
                    r6 = r13[r5]     // Catch: java.lang.Throwable -> L38
                    r7 = 3
                    r7 = r13[r7]     // Catch: java.lang.Throwable -> L38
                    char[] r8 = com.appsflyer.internal.AFa1xSDK.AFa1wSDK.C0095AFa1wSDK.valueOf     // Catch: java.lang.Throwable -> L38
                    char[] r9 = new char[r4]     // Catch: java.lang.Throwable -> L38
                    java.lang.System.arraycopy(r8, r2, r9, r1, r4)     // Catch: java.lang.Throwable -> L38
                    if (r14 == 0) goto L49
                    char[] r2 = new char[r4]     // Catch: java.lang.Throwable -> L38
                    com.appsflyer.internal.AFf1iSDK.values = r1     // Catch: java.lang.Throwable -> L38
                    r8 = 0
                L27:
                    int r10 = com.appsflyer.internal.AFf1iSDK.values     // Catch: java.lang.Throwable -> L38
                    if (r10 >= r4) goto L48
                    r11 = r14[r10]     // Catch: java.lang.Throwable -> L38
                    if (r11 != r3) goto L3a
                    char r11 = r9[r10]     // Catch: java.lang.Throwable -> L38
                    int r11 = r11 << r3
                    int r11 = r11 + r3
                    int r11 = r11 - r8
                    char r8 = (char) r11     // Catch: java.lang.Throwable -> L38
                    r2[r10] = r8     // Catch: java.lang.Throwable -> L38
                    goto L41
                L38:
                    r12 = move-exception
                    goto L8d
                L3a:
                    char r11 = r9[r10]     // Catch: java.lang.Throwable -> L38
                    int r11 = r11 << r3
                    int r11 = r11 - r8
                    char r8 = (char) r11     // Catch: java.lang.Throwable -> L38
                    r2[r10] = r8     // Catch: java.lang.Throwable -> L38
                L41:
                    char r8 = r2[r10]     // Catch: java.lang.Throwable -> L38
                    int r10 = r10 + 1
                    com.appsflyer.internal.AFf1iSDK.values = r10     // Catch: java.lang.Throwable -> L38
                    goto L27
                L48:
                    r9 = r2
                L49:
                    if (r7 <= 0) goto L58
                    char[] r14 = new char[r4]     // Catch: java.lang.Throwable -> L38
                    java.lang.System.arraycopy(r9, r1, r14, r1, r4)     // Catch: java.lang.Throwable -> L38
                    int r2 = r4 - r7
                    java.lang.System.arraycopy(r14, r1, r9, r2, r7)     // Catch: java.lang.Throwable -> L38
                    java.lang.System.arraycopy(r14, r7, r9, r1, r2)     // Catch: java.lang.Throwable -> L38
                L58:
                    if (r12 == 0) goto L6f
                    char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L38
                    com.appsflyer.internal.AFf1iSDK.values = r1     // Catch: java.lang.Throwable -> L38
                L5e:
                    int r14 = com.appsflyer.internal.AFf1iSDK.values     // Catch: java.lang.Throwable -> L38
                    if (r14 >= r4) goto L6e
                    int r2 = r4 - r14
                    int r2 = r2 - r3
                    char r2 = r9[r2]     // Catch: java.lang.Throwable -> L38
                    r12[r14] = r2     // Catch: java.lang.Throwable -> L38
                    int r14 = r14 + 1
                    com.appsflyer.internal.AFf1iSDK.values = r14     // Catch: java.lang.Throwable -> L38
                    goto L5e
                L6e:
                    r9 = r12
                L6f:
                    if (r6 <= 0) goto L84
                    com.appsflyer.internal.AFf1iSDK.values = r1     // Catch: java.lang.Throwable -> L38
                L73:
                    int r12 = com.appsflyer.internal.AFf1iSDK.values     // Catch: java.lang.Throwable -> L38
                    if (r12 >= r4) goto L84
                    char r14 = r9[r12]     // Catch: java.lang.Throwable -> L38
                    r2 = r13[r5]     // Catch: java.lang.Throwable -> L38
                    int r14 = r14 - r2
                    char r14 = (char) r14     // Catch: java.lang.Throwable -> L38
                    r9[r12] = r14     // Catch: java.lang.Throwable -> L38
                    int r12 = r12 + 1
                    com.appsflyer.internal.AFf1iSDK.values = r12     // Catch: java.lang.Throwable -> L38
                    goto L73
                L84:
                    java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L38
                    r12.<init>(r9)     // Catch: java.lang.Throwable -> L38
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
                    r15[r1] = r12
                    return
                L8d:
                    monitor-exit(r0)
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1xSDK.AFa1wSDK.C0095AFa1wSDK.values(boolean, int[], java.lang.String, java.lang.Object[]):void");
            }
        }

        static {
            AFKeystoreWrapper();
            ViewConfiguration.getKeyRepeatDelay();
            SystemClock.currentThreadTimeMillis();
            AndroidCharacter.getMirror('0');
            ViewConfiguration.getTapTimeout();
            ViewConfiguration.getGlobalActionKeyTimeout();
            KeyEvent.keyCodeFromString("");
            ExpandableListView.getPackedPositionType(0L);
            ViewConfiguration.getKeyRepeatTimeout();
            TextUtils.indexOf((CharSequence) "", '0', 0);
            SystemClock.currentThreadTimeMillis();
            ViewConfiguration.getMaximumFlingVelocity();
            TypedValue.complexToFloat(0);
            TypedValue.complexToFraction(0, 0.0f, 0.0f);
            TextUtils.indexOf("", "", 0, 0);
            SystemClock.currentThreadTimeMillis();
            ViewConfiguration.getFadingEdgeLength();
            AudioTrack.getMinVolume();
            ViewConfiguration.getDoubleTapTimeout();
            View.resolveSizeAndState(0, 0, 0);
            ViewConfiguration.getMinimumFlingVelocity();
            Process.getGidForName("");
            ViewConfiguration.getWindowTouchSlop();
            View.MeasureSpec.getSize(0);
            ViewConfiguration.getMinimumFlingVelocity();
            ExpandableListView.getPackedPositionType(0L);
            Process.getGidForName("");
            View.combineMeasuredStates(0, 0);
            Process.getThreadPriority(0);
            Process.myTid();
            TextUtils.getOffsetAfter("", 0);
            TextUtils.indexOf("", "", 0, 0);
            ExpandableListView.getPackedPositionType(0L);
            ViewConfiguration.getZoomControlsTimeout();
            int i = afWarnLog + 47;
            afDebugLog = i % 128;
            int i2 = i % 2;
        }

        public AFa1wSDK(Map<String, Object> map, Context context) {
            this.valueOf = map;
            this.AFInAppEventParameterName = context;
            put(valueOf(), AFInAppEventType());
        }

        private static StringBuilder AFInAppEventParameterName(@NonNull String... strArr) throws Exception {
            ArrayList arrayList = new ArrayList();
            int length = strArr.length;
            int i = 0;
            while (i < 3) {
                arrayList.add(Integer.valueOf(strArr[i].length()));
                i++;
                int i2 = afWarnLog + 59;
                afDebugLog = i2 % 128;
                int i3 = i2 % 2;
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb = new StringBuilder();
            int i4 = afWarnLog + 79;
            afDebugLog = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 < intValue; i6++) {
                int i7 = afDebugLog + 125;
                afWarnLog = i7 % 128;
                int i8 = i7 % 2;
                Integer num = null;
                for (int i9 = 0; i9 < 3; i9++) {
                    int charAt = strArr[i9].charAt(i6);
                    if (num != null) {
                        charAt ^= num.intValue();
                    }
                    num = Integer.valueOf(charAt);
                }
                sb.append(Integer.toHexString(num.intValue()));
            }
            return sb;
        }

        private String AFInAppEventType() {
            String obj;
            int i;
            int intExtra;
            try {
                Map<String, Object> map = this.valueOf;
                Object[] objArr = new Object[1];
                values((Process.myPid() >> 22) - 114, AndroidCharacter.getMirror('0') + 32735, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), ExpandableListView.getPackedPositionGroup(0L) - 1226652127, (short) (Color.red(0) + 108), objArr);
                String obj2 = map.get(((String) objArr[0]).intern()).toString();
                Map<String, Object> map2 = this.valueOf;
                Object[] objArr2 = new Object[1];
                valueOf(Color.blue(0) + 7, 15 - View.MeasureSpec.getSize(0), (char) (16279 - MotionEvent.axisFromString("")), objArr2);
                String obj3 = map2.get(((String) objArr2[0]).intern()).toString();
                Object[] objArr3 = new Object[1];
                valueOf(21 - MotionEvent.axisFromString(""), View.MeasureSpec.makeMeasureSpec(0, 0) + 6, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 39425), objArr3);
                String intern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                valueOf(28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 5 - KeyEvent.getDeadChar(0, 0), (char) (Process.getGidForName("") + 1), objArr4);
                String replaceAll = intern.replaceAll(((String) objArr4[0]).intern(), "");
                StringBuilder sb = new StringBuilder();
                sb.append(obj2);
                sb.append(obj3);
                sb.append(replaceAll);
                String values2 = AFa1aSDK.values(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(values2.substring(0, 16));
                obj = sb2.toString();
            } catch (Exception e) {
                Object[] objArr5 = new Object[1];
                valueOf(ImageFormat.getBitsPerPixel(0) + 34, View.MeasureSpec.makeMeasureSpec(0, 0) + 38, (char) (Color.rgb(0, 0, 0) + 16803786), objArr5);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr6 = new Object[1];
                values((-114) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 90538110, (byte) Color.alpha(0), (-1226652122) - TextUtils.indexOf("", ""), (short) (124 - View.MeasureSpec.getSize(0)), objArr6);
                sb3.append(((String) objArr6[0]).intern());
                sb3.append(e);
                AFLogger.afRDLog(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("");
                Object[] objArr7 = new Object[1];
                values((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 114, TextUtils.getCapsMode("", 0, 0) + 90538153, (byte) KeyEvent.getDeadChar(0, 0), TextUtils.indexOf((CharSequence) "", '0') - 1226652125, (short) (((Process.getThreadPriority(0) + 20) >> 6) - 24), objArr7);
                sb4.append(((String) objArr7[0]).intern());
                obj = sb4.toString();
            }
            String str = obj;
            try {
                Context context = this.AFInAppEventParameterName;
                Object[] objArr8 = new Object[1];
                values((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 115, 90538171 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (-1226652127) - KeyEvent.getDeadChar(0, 0), (short) ((-121) - TextUtils.indexOf("", "", 0)), objArr8);
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
                int i2 = -2700;
                if (registerReceiver != null) {
                    int i3 = afWarnLog + 1;
                    afDebugLog = i3 % 128;
                    if (i3 % 2 != 0) {
                        Object[] objArr9 = new Object[1];
                        valueOf(20 >> TextUtils.indexOf("", ""), Color.rgb(1, 0, 1) + 16777227, (char) (ViewConfiguration.getLongPressTimeout() + 55), objArr9);
                        intExtra = registerReceiver.getIntExtra(((String) objArr9[0]).intern(), 17756);
                    } else {
                        Object[] objArr10 = new Object[1];
                        valueOf(TextUtils.indexOf("", "") + 71, Color.rgb(0, 0, 0) + 16777227, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr10);
                        intExtra = registerReceiver.getIntExtra(((String) objArr10[0]).intern(), -2700);
                    }
                    i2 = intExtra;
                }
                String str2 = this.AFInAppEventParameterName.getApplicationInfo().nativeLibraryDir;
                if (str2 != null) {
                    Object[] objArr11 = new Object[1];
                    values((ViewConfiguration.getScrollDefaultDelay() >> 16) - 114, 90538208 - Drawable.resolveOpacity(0, 0), (byte) Color.alpha(0), (-1226652104) - TextUtils.indexOf("", "", 0, 0), (short) (57 - View.combineMeasuredStates(0, 0)), objArr11);
                    if (str2.contains(((String) objArr11[0]).intern())) {
                        i = 1;
                        Context context2 = this.AFInAppEventParameterName;
                        Object[] objArr12 = new Object[1];
                        valueOf(130 - AndroidCharacter.getMirror('0'), 6 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) KeyEvent.keyCodeFromString(""), objArr12);
                        int size = ((SensorManager) context2.getSystemService(((String) objArr12[0]).intern())).getSensorList(-1).size();
                        StringBuilder sb5 = new StringBuilder();
                        Object[] objArr13 = new Object[1];
                        valueOf(87 - Process.getGidForName(""), (Process.myPid() >> 22) + 1, (char) View.resolveSizeAndState(0, 0, 0), objArr13);
                        sb5.append(((String) objArr13[0]).intern());
                        sb5.append(i2);
                        Object[] objArr14 = new Object[1];
                        valueOf(89 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2, (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr14);
                        sb5.append(((String) objArr14[0]).intern());
                        sb5.append(i);
                        Object[] objArr15 = new Object[1];
                        values(TextUtils.indexOf("", "", 0, 0) - 114, 90538211 - Color.green(0), (byte) View.resolveSizeAndState(0, 0, 0), (-1226652186) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) ((-59) - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr15);
                        sb5.append(((String) objArr15[0]).intern());
                        sb5.append(size);
                        Object[] objArr16 = new Object[1];
                        valueOf((ViewConfiguration.getWindowTouchSlop() >> 8) + 91, 2 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 7727), objArr16);
                        sb5.append(((String) objArr16[0]).intern());
                        sb5.append(this.valueOf.size());
                        String obj4 = sb5.toString();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(str);
                        sb6.append(C0095AFa1wSDK.values(obj4));
                        return sb6.toString();
                    }
                }
                int i4 = afWarnLog + 77;
                afDebugLog = i4 % 128;
                int i5 = i4 % 2;
                i = 0;
                Context context22 = this.AFInAppEventParameterName;
                Object[] objArr122 = new Object[1];
                valueOf(130 - AndroidCharacter.getMirror('0'), 6 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) KeyEvent.keyCodeFromString(""), objArr122);
                int size2 = ((SensorManager) context22.getSystemService(((String) objArr122[0]).intern())).getSensorList(-1).size();
                StringBuilder sb52 = new StringBuilder();
                Object[] objArr132 = new Object[1];
                valueOf(87 - Process.getGidForName(""), (Process.myPid() >> 22) + 1, (char) View.resolveSizeAndState(0, 0, 0), objArr132);
                sb52.append(((String) objArr132[0]).intern());
                sb52.append(i2);
                Object[] objArr142 = new Object[1];
                valueOf(89 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2, (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr142);
                sb52.append(((String) objArr142[0]).intern());
                sb52.append(i);
                Object[] objArr152 = new Object[1];
                values(TextUtils.indexOf("", "", 0, 0) - 114, 90538211 - Color.green(0), (byte) View.resolveSizeAndState(0, 0, 0), (-1226652186) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) ((-59) - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr152);
                sb52.append(((String) objArr152[0]).intern());
                sb52.append(size2);
                Object[] objArr162 = new Object[1];
                valueOf((ViewConfiguration.getWindowTouchSlop() >> 8) + 91, 2 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 7727), objArr162);
                sb52.append(((String) objArr162[0]).intern());
                sb52.append(this.valueOf.size());
                String obj42 = sb52.toString();
                StringBuilder sb62 = new StringBuilder();
                sb62.append(str);
                sb62.append(C0095AFa1wSDK.values(obj42));
                return sb62.toString();
            } catch (Exception e2) {
                Object[] objArr17 = new Object[1];
                values((-114) - Color.blue(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 90538212, (byte) Color.blue(0), (-1226652121) - (ViewConfiguration.getTapTimeout() >> 16), (short) (Color.alpha(0) + 1), objArr17);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr17[0]).intern(), e2);
                StringBuilder sb7 = new StringBuilder();
                Object[] objArr18 = new Object[1];
                values((ViewConfiguration.getLongPressTimeout() >> 16) - 114, 90538109 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (AndroidCharacter.getMirror('0') - '0'), (-1226652122) - (ViewConfiguration.getScrollBarSize() >> 8), (short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 124), objArr18);
                sb7.append(((String) objArr18[0]).intern());
                sb7.append(e2);
                AFLogger.afRDLog(sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                Object[] objArr19 = new Object[1];
                values((ViewConfiguration.getFadingEdgeLength() >> 16) - 114, TextUtils.getOffsetAfter("", 0) + 90538229, (byte) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1226652123, (short) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 91), objArr19);
                sb8.append(((String) objArr19[0]).intern());
                return sb8.toString();
            }
        }

        static void AFKeystoreWrapper() {
            AFInAppEventType = -90537999;
            AFKeystoreWrapper = 113;
            values = 1226652224;
            afInfoLog = new byte[]{-101, -105, -96, -127, -107, -94, -116, -104, -119, -87, -115, -103, -108, 87, 110, 80, 113, -105, -9, 14, -16, 17, -28, 17, 2, -110, -120, -127, -73, -97, -74, -99, 2, 82, -65, -91, -10, 101, -84, -91, -10, 100, -92, -80, -96, -66, -102, -72, -94, -76, -87, -14, 103, -86, -92, -82, -77, -90, -15, 82, -65, -59, -60, -121, -115, -70, -87, -14, -71, -90, -116, -65, -58, -75, -60, -53, -62, -85, -45, 5, 120, -76, -53, -78, 23, 103, -44, -70, 11, 122, -63, -70, 11, 121, -71, -59, -75, -45, -81, -51, -73, -55, -66, 7, 124, -65, -71, -61, -56, -69, -69, 106, 80, -125, -118, 121, -120, -113, -122, 111, -105, -55, 60, 120, -113, 118, -37, 63, 116, -115, -113, 111, -38, 62, -123, 126, -49, 61, 125, -119, 121, -105, 115, -111, 123, -115, -126, -53, 64, -125, 125, -121, -116, Byte.MAX_VALUE, -95, 31, 25, 22, -28, 77, 16, -19, 76, 20, 23, 29, -29, 28, 20, 27, 25, 23, -76, 120, 119, 114, -122, 114, 126, 93, Byte.MAX_VALUE, Byte.MIN_VALUE, -122, 106, 121, -116, 120, -115, 57, 120, Byte.MAX_VALUE, 110, -118, 123, -84, 51, Byte.MAX_VALUE, -126, 106, Byte.MAX_VALUE, 126, -76, 67, 116, 115, 118, -121, 111, -122, -110, -59, -121, -111, -120, -97, 2, -4, -1, 12, 68, -70, -17, 8, 10, 10, 35, -37, -31, 14, -3, -97, 103, 72, 103, 96, -116, 91, 29, -102, 28, -102, 27, -100, 26, -100, 37};
            afErrorLog = new char[]{10221, 57176, 54934, 52622, 50515, 64536, 62429, 16382, 51018, 52892, 54746, 56576, 58483, 60315, 62192, 64046, 33128, 35006, 36821, 38717, 40595, 42439, 39479, 25236, 27462, 28672, 30915, 16790, CoreConstants.DASH_CHAR, 63689, 61717, 59935, 58054, 26541, 40724, 38600, 36269, 34068, 48187, 46025, 43707, 41575, 55612, 53412, 55205, 53103, 50908, 64924, 62810, 60446, 58241, 6795, 4686, 2360, 248, 1962, 16230, 13878, 11744, 9562, 23572, 21406, 19086, 16965, 30985, 28810, 30631, 28541, 26167, 40435, 38056, 't', 63710, 61723, 59969, 57993, 56277, 54275, 52585, 50605, 48865, 46891, 's', 63710, 61720, 59970, 57987, 56277, 'b', '&', 63683, 7689, 59108};
            afRDLog = 2137247597649524923L;
        }

        @NonNull
        private String valueOf() {
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                Map<String, Object> map = this.valueOf;
                Object[] objArr = new Object[1];
                values(View.MeasureSpec.getMode(0) - 114, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 90537998, (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), (-1226652128) - TextUtils.indexOf((CharSequence) "", '0'), (short) (108 - View.resolveSize(0, 0)), objArr);
                String obj = map.get(((String) objArr[0]).intern()).toString();
                Map<String, Object> map2 = this.valueOf;
                Object[] objArr2 = new Object[1];
                values(TextUtils.getOffsetBefore("", 0) - 114, 90538011 - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), (-1226652126) + View.resolveSizeAndState(0, 0, 0), (short) ((-96) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr2);
                String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
                if (obj2 == null) {
                    Object[] objArr3 = new Object[1];
                    values((-115) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 90538016 - View.getDefaultSize(0, 0), (byte) Color.alpha(0), (-1226652146) + (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr3);
                    obj2 = ((String) objArr3[0]).intern();
                    int i = afDebugLog + 89;
                    afWarnLog = i % 128;
                    int i2 = i % 2;
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder AFInAppEventParameterName = AFInAppEventParameterName(num, obj2, sb.toString());
                int length = AFInAppEventParameterName.length();
                if (length > 4) {
                    int i3 = afWarnLog + 23;
                    afDebugLog = i3 % 128;
                    if (i3 % 2 != 0) {
                        AFInAppEventParameterName.delete(2, length);
                    } else {
                        AFInAppEventParameterName.delete(4, length);
                    }
                } else {
                    while (length < 4) {
                        length++;
                        AFInAppEventParameterName.append('1');
                    }
                }
                Object[] objArr4 = new Object[1];
                values((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 114, 90538024 - (Process.myTid() >> 22), (byte) (AndroidCharacter.getMirror('0') - '0'), (-1226652117) + (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (View.MeasureSpec.getMode(0) + 121), objArr4);
                AFInAppEventParameterName.insert(0, ((String) objArr4[0]).intern());
                return AFInAppEventParameterName.toString();
            } catch (Exception e) {
                Object[] objArr5 = new Object[1];
                values((-114) - Color.argb(0, 0, 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 90538027, (byte) ((-1) - Process.getGidForName("")), 50608 + AndroidCharacter.getMirror('0'), (short) ((Process.myPid() >> 22) + 85), objArr5);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr6 = new Object[1];
                values((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 115, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 90538068, (byte) (ViewConfiguration.getTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) - 1226652122, (short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 63), objArr6);
                sb2.append(((String) objArr6[0]).intern());
                sb2.append(e);
                AFLogger.afRDLog(sb2.toString());
                Object[] objArr7 = new Object[1];
                valueOf((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 7 - TextUtils.getCapsMode("", 0, 0), (char) (10118 - View.resolveSizeAndState(0, 0, 0)), objArr7);
                return ((String) objArr7[0]).intern();
            }
        }

        private static void values(int i, int i2, byte b, int i3, short s, Object[] objArr) {
            int i4;
            String obj;
            synchronized (AFf1bSDK.values) {
                try {
                    StringBuilder sb = new StringBuilder();
                    int i5 = AFKeystoreWrapper;
                    int i6 = i + i5;
                    if (i6 == -1) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    if (i4 != 0) {
                        byte[] bArr = afInfoLog;
                        if (bArr != null) {
                            i6 = (byte) (bArr[AFInAppEventType + i2] + i5);
                        } else {
                            i6 = (short) (AFLogger[AFInAppEventType + i2] + i5);
                        }
                    }
                    if (i6 > 0) {
                        AFf1bSDK.AFInAppEventType = ((i2 + i6) - 2) + AFInAppEventType + i4;
                        char c = (char) (i3 + values);
                        AFf1bSDK.valueOf = c;
                        sb.append(c);
                        AFf1bSDK.AFInAppEventParameterName = AFf1bSDK.valueOf;
                        AFf1bSDK.AFKeystoreWrapper = 1;
                        while (AFf1bSDK.AFKeystoreWrapper < i6) {
                            byte[] bArr2 = afInfoLog;
                            if (bArr2 != null) {
                                int i7 = AFf1bSDK.AFInAppEventType;
                                AFf1bSDK.AFInAppEventType = i7 - 1;
                                AFf1bSDK.valueOf = (char) (AFf1bSDK.AFInAppEventParameterName + (((byte) (bArr2[i7] + s)) ^ b));
                            } else {
                                short[] sArr = AFLogger;
                                int i8 = AFf1bSDK.AFInAppEventType;
                                AFf1bSDK.AFInAppEventType = i8 - 1;
                                AFf1bSDK.valueOf = (char) (AFf1bSDK.AFInAppEventParameterName + (((short) (sArr[i8] + s)) ^ b));
                            }
                            sb.append(AFf1bSDK.valueOf);
                            AFf1bSDK.AFInAppEventParameterName = AFf1bSDK.valueOf;
                            AFf1bSDK.AFKeystoreWrapper++;
                        }
                    }
                    obj = sb.toString();
                } catch (Throwable th) {
                    throw th;
                }
            }
            objArr[0] = obj;
        }

        private static void valueOf(int i, int i2, char c, Object[] objArr) {
            String str;
            synchronized (AFg1wSDK.AFInAppEventParameterName) {
                try {
                    char[] cArr = new char[i2];
                    AFg1wSDK.AFKeystoreWrapper = 0;
                    while (true) {
                        int i3 = AFg1wSDK.AFKeystoreWrapper;
                        if (i3 < i2) {
                            cArr[i3] = (char) ((afErrorLog[i + i3] ^ (i3 * afRDLog)) ^ c);
                            AFg1wSDK.AFKeystoreWrapper = i3 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            objArr[0] = str;
        }
    }

    private static String AFInAppEventType(String str) {
        Object[] objArr = new Object[1];
        AFKeystoreWrapper((-97) - View.getDefaultSize(0, 0), (-1210396222) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) (10 - KeyEvent.normalizeMetaState(0)), (Process.myTid() >> 22) + 696978983, (short) (80 - MotionEvent.axisFromString("")), objArr);
        if (!str.contains(((String) objArr[0]).intern())) {
            return str;
        }
        Object[] objArr2 = new Object[1];
        AFKeystoreWrapper(65488 - AndroidCharacter.getMirror('0'), ExpandableListView.getPackedPositionChild(0L) - 1210396221, (byte) (Color.blue(0) - 94), 696979028 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) (View.resolveSizeAndState(0, 0, 0) - 106), objArr2);
        String[] split = str.split(((String) objArr2[0]).intern());
        int length = split.length;
        StringBuilder sb = new StringBuilder();
        int i = length - 1;
        sb.append(split[i]);
        Object[] objArr3 = new Object[1];
        AFKeystoreWrapper((ViewConfiguration.getScrollDefaultDelay() >> 16) - 97, (-1210396222) - Color.red(0), (byte) (TextUtils.getTrimmedLength("") + 10), 696978983 - Gravity.getAbsoluteGravity(0, 0), (short) (AndroidCharacter.getMirror('0') + '!'), objArr3);
        sb.append(((String) objArr3[0]).intern());
        for (int i2 = 1; i2 < i; i2++) {
            int i3 = AFLogger + 49;
            afDebugLog = i3 % 128;
            int i4 = i3 % 2;
            sb.append(split[i2]);
            Object[] objArr4 = new Object[1];
            AFKeystoreWrapper((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 97, (ViewConfiguration.getTapTimeout() >> 16) - 1210396222, (byte) (10 - Color.red(0)), 696978983 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (View.resolveSize(0, 0) + 81), objArr4);
            sb.append(((String) objArr4[0]).intern());
        }
        sb.append(split[0]);
        String obj = sb.toString();
        int i5 = afDebugLog + 53;
        AFLogger = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    private static String values(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, AFKeystoreWrapper(str2).charAt(0));
        String obj = sb.toString();
        int i2 = AFLogger + 21;
        afDebugLog = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    private static void values(StringBuilder sb) {
        String intern;
        Object obj;
        String intern2;
        Object obj2;
        Object[] objArr = new Object[1];
        values((byte) (51 - TextUtils.getOffsetAfter("", 0)), "\u0014\u0000\f\u0001\u0016\u0015\u000e\u000f\u0017\u001b\u0011\b\u0016\u0018\u001d\u001a\u0005\f\u0006\u0016\u0000\u0014\u0001\u001b㘛", TextUtils.getOffsetAfter("", 0) + 25, objArr);
        if (!AFInAppEventParameterName(((String) objArr[0]).intern())) {
            Object[] objArr2 = new Object[1];
            values((byte) ((ViewConfiguration.getTouchSlop() >> 8) + 95), "㘉", 1 - KeyEvent.normalizeMetaState(0), objArr2);
            intern = ((String) objArr2[0]).intern();
            int i = afDebugLog + 19;
            AFLogger = i % 128;
            int i2 = i % 2;
        } else {
            int i3 = AFLogger + 73;
            afDebugLog = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr3 = new Object[1];
                values((byte) (21 << (ViewConfiguration.getScrollDefaultDelay() >> 17)), "㘐", 1 << (ViewConfiguration.getScrollBarFadeDuration() >>> 2), objArr3);
                intern = ((String) objArr3[0]).intern();
            } else {
                Object[] objArr4 = new Object[1];
                values((byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 101), "㘐", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr4);
                intern = ((String) objArr4[0]).intern();
            }
        }
        sb.append(intern);
        Object[] objArr5 = new Object[1];
        AFKeystoreWrapper(ExpandableListView.getPackedPositionGroup(0L) - 75, (-1210396277) + (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (KeyEvent.normalizeMetaState(0) + 114), Drawable.resolveOpacity(0, 0) + 696979034, (short) (89 - (Process.myPid() >> 22)), objArr5);
        if (AFInAppEventParameterName(((String) objArr5[0]).intern())) {
            Object[] objArr6 = new Object[1];
            values((byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 101), "㘐", (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr6);
            obj = objArr6[0];
        } else {
            Object[] objArr7 = new Object[1];
            values((byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 94), "㘉", 1 - (ViewConfiguration.getEdgeSlop() >> 16), objArr7);
            obj = objArr7[0];
        }
        sb.append(((String) obj).intern());
        Object[] objArr8 = new Object[1];
        AFKeystoreWrapper((-78) - ExpandableListView.getPackedPositionGroup(0L), (-1210396255) - TextUtils.indexOf("", "", 0, 0), (byte) (TextUtils.indexOf("", "", 0) - 73), (ViewConfiguration.getFadingEdgeLength() >> 16) + 696979034, (short) (76 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr8);
        if (AFInAppEventParameterName(((String) objArr8[0]).intern())) {
            int i4 = afDebugLog + 105;
            AFLogger = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr9 = new Object[1];
            values((byte) (101 - (ViewConfiguration.getEdgeSlop() >> 16)), "㘐", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr9);
            intern2 = ((String) objArr9[0]).intern();
        } else {
            Object[] objArr10 = new Object[1];
            values((byte) (Color.green(0) + 95), "㘉", Color.argb(0, 0, 0, 0) + 1, objArr10);
            intern2 = ((String) objArr10[0]).intern();
            int i6 = AFLogger + 75;
            afDebugLog = i6 % 128;
            int i7 = i6 % 2;
        }
        sb.append(intern2);
        Object[] objArr11 = new Object[1];
        AFKeystoreWrapper((-83) - Gravity.getAbsoluteGravity(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1210396237, (byte) (-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 696979034 - Color.alpha(0), (short) (57 - TextUtils.getCapsMode("", 0, 0)), objArr11);
        if (AFInAppEventParameterName(((String) objArr11[0]).intern())) {
            Object[] objArr12 = new Object[1];
            values((byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 102), "㘐", 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr12);
            obj2 = objArr12[0];
        } else {
            Object[] objArr13 = new Object[1];
            values((byte) (95 - View.getDefaultSize(0, 0)), "㘉", 1 - (ViewConfiguration.getTouchSlop() >> 8), objArr13);
            obj2 = objArr13[0];
        }
        sb.append(((String) obj2).intern());
    }

    private static String AFInAppEventType(Context context, StringBuilder sb) {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        String packageName = context.getPackageName();
        String AFInAppEventType2 = AFInAppEventType(packageName);
        Object[] objArr = new Object[1];
        values((byte) (101 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), "㘐", 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        sb2.append(AFInAppEventType2);
        if (valueOf(context) == null) {
            int i = AFLogger + 109;
            afDebugLog = i % 128;
            if (i % 2 != 0) {
                Object[] objArr2 = new Object[1];
                values((byte) (119 - (KeyEvent.getMaxKeyCode() % 110)), "㘉", Color.argb(1, 1, 0, 1), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                values((byte) ((KeyEvent.getMaxKeyCode() >> 16) + 95), "㘉", Color.argb(0, 0, 0, 0) + 1, objArr3);
                obj = objArr3[0];
            }
            sb.append(((String) obj).intern());
            sb2.append(packageName);
        } else {
            Object[] objArr4 = new Object[1];
            values((byte) (MotionEvent.axisFromString("") + 102), "㘐", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr4);
            sb.append(((String) objArr4[0]).intern());
            sb2.append(packageName);
        }
        String AFInAppEventParameterName2 = AFInAppEventParameterName(context);
        if (AFInAppEventParameterName2 == null) {
            Object[] objArr5 = new Object[1];
            values((byte) (96 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "㘉", 1 - TextUtils.indexOf("", ""), objArr5);
            sb.append(((String) objArr5[0]).intern());
            sb2.append(packageName);
        } else {
            Object[] objArr6 = new Object[1];
            values((byte) (100 - TextUtils.lastIndexOf("", '0')), "㘐", (-16777215) - Color.rgb(0, 0, 0), objArr6);
            sb.append(((String) objArr6[0]).intern());
            sb2.append(AFInAppEventParameterName2);
            int i2 = AFLogger + 37;
            afDebugLog = i2 % 128;
            int i3 = i2 % 2;
        }
        sb2.append(Boolean.TRUE.toString());
        return sb2.toString();
    }

    private static String values(String str) {
        int i = AFLogger + 13;
        afDebugLog = i % 128;
        if (i % 2 == 0) {
            return AFa1aSDK.AFInAppEventParameterName(AFa1aSDK.values(str));
        }
        AFa1aSDK.AFInAppEventParameterName(AFa1aSDK.values(str));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r11 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void values(byte r10, java.lang.String r11, int r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1xSDK.values(byte, java.lang.String, int, java.lang.Object[]):void");
    }
}
