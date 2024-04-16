package com.inappstory.sdk.stories.utils;

import org.slf4j.Marker;
/* loaded from: classes3.dex */
public class PhoneFormats {
    public static String[] codes = {"+247", "+376", "+971", "+971", "+93", "+1268", "+1264", "+355", "+374", "+599", "+599", "+599", "+244", "+672", "+54", "+1684", "+43", "+61", "+297", "+994", "+387", "+387", "+1246", "+880", "+32", "+226", "+359", "+973", "+257", "+229", "+1441", "+673", "+591", "+55", "+55", "+55", "+1242", "+975", "+975", "+267", "+375", "+501", "+243", "+236", "+242", "+41", "+225", "+682", "+56", "+237", "+86", "+86", "+86", "+57", "+506", "+53", "+238", "+599", "+357", "+420", "+49", "+49", "+49", "+49", "+49", "+49", "+253", "+45", "+1767", "+1809", "+1829", "+1849", "+213", "+593", "+593", "+372", "+372", "+20", "+291", "+34", "+251", "+358", "+679", "+500", "+691", "+298", "+262", "+33", "+508", "+590", "+241", "+1473", "+995", "+594", "+233", "+350", "+299", "+220", "+224", "+240", "+30", "+502", "+1671", "+245", "+592", "+852", "+504", "+385", "+509", "+36", "+628", "+62", "+62", "+62", "+628", "+628", "+353", "+972", "+972", "+91", "+246", "+964", "+98", "+354", "+39", "+1876", "+962", "+81", "+81", "+254", "+996", "+855", "+686", "+269", "+1869", "+850", "+850", "+850", "+850", "+850", "+850", "+82", "+965", "+1345", "+76", "+77", "+856", "+856", "+961", "+961", "+1758", "+423", "+94", "+231", "+266", "+370", "+352", "+371", "+218", "+218", "+212", "+377", "+377", "+373", "+382", "+261", "+692", "+389", "+223", "+95", "+95", "+95", "+976", "+853", "+1670", "+596", "+222", "+1664", "+356", "+230", "+960", "+265", "+265", "+52", "+52", "+60", "+60", "+60", "+60", "+258", "+264", "+687", "+227", "+672", "+234", "+234", "+234", "+234", "+505", "+31", "+47", "+977", "+674", "+683", "+64", "+64", "+64", "+968", "+507", "+51", "+689", "+675", "+63", "+92", "+48", "+970", "+351", "+680", "+595", "+974", "+262", "+40", "+381", "+7", "+250", "+966", "+966", "+677", "+677", "+248", "+249", "+46", "+65", "+290", "+290", "+386", "+421", "+232", "+378", "+221", "+252", "+252", "+252", "+597", "+597", "+211", "+239", "+503", "+1721", "+963", "+268", "+1649", "+235", "+228", "+66", "+66", "+992", "+690", "+670", "+670", "+670", "+993", "+216", "+676", "+90", "+1868", "+688", "+688", "+886", "+886", "+255", "+380", "+256", "+44", "+598", "+998", "+396", "+1784", "+58", "+1284", "+1340", "+84", "+84", "+678", "+678", "+681", "+685", "+967", "+967", "+967", "+27", "+260", "+263", "+1", "+383"};
    public static String[] masks = {"−−−−", "−− −− −−", "−− −−− −−−−", "− −−− −−−−", "−− −−− −−−−", "−−− −−−−", "−−− −−−−", "−−− −−− −−−", "−− −−− −−−", "−−− −−−−", "−−− −−−−", "− −−− −−−−", "−−− −−− −−−", "− −− −−−", "−−− −−− −−−−", "−−− −−−−", "−−− −−− −−−−", "− −−−− −−−−", "−−− −−−−", "−− −−− −− −−", "−− −−− −−−", "−− −−−−", "−−− −−−−", "−− −−− −−−", "−−− −−− −−−", "−− −− −−−−", "−−− −−− −−−", "−−−− −−−−", "−− −− −−−−", "−− −− −−−−", "−−− −−−−", "−−− −−−−", "− −−− −−−−", "−− −−−−− −−−−", "−− −−−− −−−−", "−− −−−− −−−−", "−−− −−−−", "−− −−− −−−", "− −−− −−−", "−− −−− −−−", "−− −−− −− −−", "−−− −−−−", "−−− −−− −−−", "−− −− −−−−", "−− −−− −−−−", "−− −−− −−−−", "−− −−− −−−", "−− −−−", "− −−−− −−−−", "−−−− −−−−", "−−− −−−− −−−−", "−−− −−−− −−−", "−− −−−−− −−−−−", "−−− −−− −−−−", "−−−− −−−−", "− −−− −−−−", "−−− −− −−", "−−− −−−−", "−− −−− −−−", "−−− −−− −−−", "−−−− −−− −−−−", "−−− −−− −−−−", "−−− −− −−−−", "−−− −− −−−", "−−− −− −−", "−−− −−−", "−− −− −− −−", "−− −− −− −−", "−−− −−−−", "−−− −−−−", "−−− −−−−", "−−− −−−−", "−− −−− −−−−", "−− −−− −−−−", "− −−− −−−−", "−−−− −−−−", "−−− −−−−", "−−− −−− −−−−", "− −−− −−−", "−−− −−− −−−", "−− −−− −−−−", "−−− −−− −− −−", "−− −−−−−", "−−−−−", "−−− −−−−", "−−− −−−", "−−−−− −−−−", "−−− −−− −−−", "−− −−−−", "−−− −−− −−−", "− −− −− −−", "−−− −−−−", "−−− −−− −−−", "−−−−− −−−−", "−−− −−− −−−", "−−− −−−−−", "−− −− −−", "−−− −− −−", "−− −−− −−−", "−− −−− −−−−", "−−− −−− −−−−", "− −−− −−−−", "−−− −−−−", "− −−−−−−", "−−− −−−−", "−−−− −−−−", "−−−− −−−−", "−− −−− −−−", "−− −− −−−−", "−−− −−− −−−", "−− −−− −−−−", "−− −−− −−", "−− −−− −−−", "−− −−− −−−−", "−− −−− −−−", "−− −−− −− −−−", "−−− −−− −−−", "−− −−− −−−−", "− −−− −−−−", "−−−− −−− −−−", "−−− −−−−", "−−− −−− −−−−", "−−− −−− −−−−", "−−− −−−−", "−−− −−−− −−−", "−−− −−−−", "− −−−− −−−−", "−− −−−− −−−−", "−−− −−− −−−", "−−− −−−−−−", "−−− −−− −−−", "−− −−− −−−", "−− −−−", "−− −−−−−", "−−− −−−−", "−−− −−− −−−−", "−− −−− −−−", "−−− −−−− −−−", "−−− −−−", "−−−− −−−−", "−−−− −−−−−−−−−−−−−", "−− −−− −−−−", "−−−− −−−−", "−−− −−−−", "−− −−− −− −−", "−− −−− −− −−", "−− −− −−− −−−", "−− −−− −−−", "−− −−− −−−", "− −−− −−−", "−−− −−−−", "−−− −−− −−−−", "−− −−− −−−−", "−− −−− −−−", "− −−− −−−−", "−−− −− −−−", "−−− −−− −−−", "−− −−− −−−", "−− −−− −−−−", "−− −−− −−−", "−− −−−− −−−", "−−−− −−−−", "−−− −−− −−−", "−−−− −−−−", "−− −−− −−−", "−− −− −−−−−", "−−− −−−−", "−− −−− −−−", "−− −− −−−−", "−− −−− −−−", "− −−− −−−", "−−− −−−", "−− −− −−−−", "−−−− −−−−", "−−− −−−−", "−−− −− −− −−", "−− −− −−−−", "−−− −−−−", "−−−− −−−−", "−−− −−−−", "−−− −−−−", "−− −−− −−−−", "− −−− −−−", "−−− −−− −−−−", "−− −− −−−−", "−− −−− −−−−", "−−− −−− −−−", "−− −−− −−−", "− −−− −−−", "−− −−− −−−", "−− −−− −−−−", "−− −−−−", "−− −− −−−−", "− −− −−−", "−−− −−− −−−−", "−− −−− −−−", "−− −−− −−", "−−− −−− −−−−", "−−−− −−−−", "−− −−− −−−−", "−−− −− −−−", "−− −−− −−−", "−−− −−−−", "−−−−", "−−− −−− −−−", "−− −−− −−−", "−−− −−− −−−−", "−− −−− −−−", "−−− −−−−", "−−− −−− −−−", "−− −− −−", "−−− −− −−−", "−−− −−− −−−−", "−−− −−− −−−−", "−−− −−− −−−", "−− −−− −−−−", "−− −−− −−−−", "−−− −−−−", "−−− −−− −−−", "−−−− −−−−", "−−−−− −−−−", "−− −−− −−−−", "−− −−− −−−−", "−−− −−− −− −−", "−−− −−− −−−", "−− −−− −−−−", "− −−− −−−−", "−−− −−−−", "−−−−−", "− −−− −−−", "−− −−− −−−−", "−− −−− −−−−", "−−−− −−−−", "−− −−−", "−−−−", "−− −−− −−−", "−−− −−− −−−", "−− −−−−−−", "−−−− −−−−−−", "−− −−− −−−−", "−− −−− −−−", "− −−− −−−", "− −−− −−−", "−−− −−−−", "−−− −−−", "−− −−− −−−−", "−− −−−−−", "−− −− −−−−", "−−− −−−−", "−− −−−− −−−", "−− −− −−−−", "−−− −−−−", "−− −− −− −−", "−− −−− −−−", "−− −−− −−−−", "−− −−− −−−", "−− −−− −−−−", "−−−−", "−−− −−−−", "−− − −−−−−", "−− − −−−−−", "− −−− −−−−", "−− −−− −−−", "−−−−−", "−−− −−− −−−−", "−−− −−−−", "−− −−−−", "− −−−−", "−−− −−− −−−", "−−−− −−−−", "−− −−− −−−−", "−− −−− −− −−", "−−− −−− −−−", "−− −−−− −−−−", "− −−− −− −−", "−− −−− −−−−", "−−− −−−−−", "−−− −−−−", "−−− −−− −−−−", "−−− −−−−", "−−− −−−−", "−− −−−− −−−", "−−− −−−− −−−", "−− −−−−−", "−−−−−", "−− −−−−", "−− −−−−", "−−− −−− −−−", "− −−− −−−", "−− −−− −−−", "−− −−− −−−−", "−− −−− −−−−", "− −−−−−−", "−−− −−− −−−−", "−−−− −−−−"};

    public static String getMaskByCode(String str) {
        if (str != null && !str.isEmpty() && !str.equals(Marker.ANY_NON_NULL_MARKER)) {
            int i = 0;
            while (true) {
                String[] strArr = codes;
                if (i >= strArr.length) {
                    break;
                } else if (str.equals(strArr[i])) {
                    return masks[i];
                } else {
                    i++;
                }
            }
        }
        return null;
    }
}
