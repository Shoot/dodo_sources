package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableRow;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.slider.Slider;
import im.threads.R;
import im.threads.ui.views.CircularProgressButton;
import im.threads.ui.widget.textView.BubbleMessageTextView;
import im.threads.ui.widget.textView.BubbleTimeTextView;
import im.threads.ui.widget.textView.QuoteAuthorTextView;
import im.threads.ui.widget.textView.QuoteMessageTextView;
import im.threads.ui.widget.textView.QuoteTimeTextView;
/* loaded from: classes3.dex */
public final class EccItemUserTextWithFileBinding {
    @NonNull
    public final LinearLayout bubble;
    @NonNull
    public final CircularProgressButton buttonDownload;
    @NonNull
    public final View delimiter;
    @NonNull
    public final ImageView errorImage;
    @NonNull
    public final BubbleTimeTextView errorText;
    @NonNull
    public final BubbleMessageTextView fileSize;
    @NonNull
    public final QuoteMessageTextView fileSpecs;
    @NonNull
    public final ImageView image;
    @NonNull
    public final FrameLayout imageLayout;
    @NonNull
    public final FrameLayout imageRoot;
    @NonNull
    public final ImageView loader;
    @NonNull
    public final FrameLayout phraseFrame;
    @NonNull
    public final View quoteDelimiter;
    @NonNull
    public final QuoteMessageTextView quoteFileSpecs;
    @NonNull
    public final ImageView quoteImage;
    @NonNull
    public final QuoteTimeTextView quoteSendAt;
    @NonNull
    public final TableRow quoteTextRow;
    @NonNull
    public final QuoteAuthorTextView quoteTo;
    @NonNull
    public final TableRow rightTextRow;
    @NonNull
    public final RelativeLayout rootLayout;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final QuoteTimeTextView sendAt;
    @NonNull
    public final BubbleMessageTextView text;
    @NonNull
    public final BubbleTimeTextView timeStamp;
    @NonNull
    public final QuoteAuthorTextView to;
    @NonNull
    public final ConstraintLayout voiceMessage;
    @NonNull
    public final ImageButton voiceMessageUserButtonPlayPause;
    @NonNull
    public final Slider voiceMessageUserSlider;
    @NonNull
    public final BubbleTimeTextView voiceTimeStamp;

    private EccItemUserTextWithFileBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull CircularProgressButton circularProgressButton, @NonNull View view, @NonNull ImageView imageView, @NonNull BubbleTimeTextView bubbleTimeTextView, @NonNull BubbleMessageTextView bubbleMessageTextView, @NonNull QuoteMessageTextView quoteMessageTextView, @NonNull ImageView imageView2, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView3, @NonNull FrameLayout frameLayout3, @NonNull View view2, @NonNull QuoteMessageTextView quoteMessageTextView2, @NonNull ImageView imageView4, @NonNull QuoteTimeTextView quoteTimeTextView, @NonNull TableRow tableRow, @NonNull QuoteAuthorTextView quoteAuthorTextView, @NonNull TableRow tableRow2, @NonNull RelativeLayout relativeLayout2, @NonNull QuoteTimeTextView quoteTimeTextView2, @NonNull BubbleMessageTextView bubbleMessageTextView2, @NonNull BubbleTimeTextView bubbleTimeTextView2, @NonNull QuoteAuthorTextView quoteAuthorTextView2, @NonNull ConstraintLayout constraintLayout, @NonNull ImageButton imageButton, @NonNull Slider slider, @NonNull BubbleTimeTextView bubbleTimeTextView3) {
        this.rootView = relativeLayout;
        this.bubble = linearLayout;
        this.buttonDownload = circularProgressButton;
        this.delimiter = view;
        this.errorImage = imageView;
        this.errorText = bubbleTimeTextView;
        this.fileSize = bubbleMessageTextView;
        this.fileSpecs = quoteMessageTextView;
        this.image = imageView2;
        this.imageLayout = frameLayout;
        this.imageRoot = frameLayout2;
        this.loader = imageView3;
        this.phraseFrame = frameLayout3;
        this.quoteDelimiter = view2;
        this.quoteFileSpecs = quoteMessageTextView2;
        this.quoteImage = imageView4;
        this.quoteSendAt = quoteTimeTextView;
        this.quoteTextRow = tableRow;
        this.quoteTo = quoteAuthorTextView;
        this.rightTextRow = tableRow2;
        this.rootLayout = relativeLayout2;
        this.sendAt = quoteTimeTextView2;
        this.text = bubbleMessageTextView2;
        this.timeStamp = bubbleTimeTextView2;
        this.to = quoteAuthorTextView2;
        this.voiceMessage = constraintLayout;
        this.voiceMessageUserButtonPlayPause = imageButton;
        this.voiceMessageUserSlider = slider;
        this.voiceTimeStamp = bubbleTimeTextView3;
    }

    @NonNull
    public static EccItemUserTextWithFileBinding bind(@NonNull View view) {
        View a;
        View a2;
        int i = R.id.bubble;
        LinearLayout linearLayout = (LinearLayout) pyb.a(view, i);
        if (linearLayout != null) {
            i = R.id.buttonDownload;
            CircularProgressButton circularProgressButton = (CircularProgressButton) pyb.a(view, i);
            if (circularProgressButton != null && (a = pyb.a(view, (i = R.id.delimiter))) != null) {
                i = R.id.errorImage;
                ImageView imageView = (ImageView) pyb.a(view, i);
                if (imageView != null) {
                    i = R.id.errorText;
                    BubbleTimeTextView bubbleTimeTextView = (BubbleTimeTextView) pyb.a(view, i);
                    if (bubbleTimeTextView != null) {
                        i = R.id.fileSize;
                        BubbleMessageTextView bubbleMessageTextView = (BubbleMessageTextView) pyb.a(view, i);
                        if (bubbleMessageTextView != null) {
                            i = R.id.fileSpecs;
                            QuoteMessageTextView quoteMessageTextView = (QuoteMessageTextView) pyb.a(view, i);
                            if (quoteMessageTextView != null) {
                                i = R.id.image;
                                ImageView imageView2 = (ImageView) pyb.a(view, i);
                                if (imageView2 != null) {
                                    i = R.id.imageLayout;
                                    FrameLayout frameLayout = (FrameLayout) pyb.a(view, i);
                                    if (frameLayout != null) {
                                        i = R.id.imageRoot;
                                        FrameLayout frameLayout2 = (FrameLayout) pyb.a(view, i);
                                        if (frameLayout2 != null) {
                                            i = R.id.loader;
                                            ImageView imageView3 = (ImageView) pyb.a(view, i);
                                            if (imageView3 != null) {
                                                i = R.id.phraseFrame;
                                                FrameLayout frameLayout3 = (FrameLayout) pyb.a(view, i);
                                                if (frameLayout3 != null && (a2 = pyb.a(view, (i = R.id.quoteDelimiter))) != null) {
                                                    i = R.id.quoteFileSpecs;
                                                    QuoteMessageTextView quoteMessageTextView2 = (QuoteMessageTextView) pyb.a(view, i);
                                                    if (quoteMessageTextView2 != null) {
                                                        i = R.id.quoteImage;
                                                        ImageView imageView4 = (ImageView) pyb.a(view, i);
                                                        if (imageView4 != null) {
                                                            i = R.id.quoteSendAt;
                                                            QuoteTimeTextView quoteTimeTextView = (QuoteTimeTextView) pyb.a(view, i);
                                                            if (quoteTimeTextView != null) {
                                                                i = R.id.quoteTextRow;
                                                                TableRow tableRow = (TableRow) pyb.a(view, i);
                                                                if (tableRow != null) {
                                                                    i = R.id.quoteTo;
                                                                    QuoteAuthorTextView quoteAuthorTextView = (QuoteAuthorTextView) pyb.a(view, i);
                                                                    if (quoteAuthorTextView != null) {
                                                                        i = R.id.rightTextRow;
                                                                        TableRow tableRow2 = (TableRow) pyb.a(view, i);
                                                                        if (tableRow2 != null) {
                                                                            RelativeLayout relativeLayout = (RelativeLayout) view;
                                                                            i = R.id.sendAt;
                                                                            QuoteTimeTextView quoteTimeTextView2 = (QuoteTimeTextView) pyb.a(view, i);
                                                                            if (quoteTimeTextView2 != null) {
                                                                                i = R.id.text;
                                                                                BubbleMessageTextView bubbleMessageTextView2 = (BubbleMessageTextView) pyb.a(view, i);
                                                                                if (bubbleMessageTextView2 != null) {
                                                                                    i = R.id.timeStamp;
                                                                                    BubbleTimeTextView bubbleTimeTextView2 = (BubbleTimeTextView) pyb.a(view, i);
                                                                                    if (bubbleTimeTextView2 != null) {
                                                                                        i = R.id.to;
                                                                                        QuoteAuthorTextView quoteAuthorTextView2 = (QuoteAuthorTextView) pyb.a(view, i);
                                                                                        if (quoteAuthorTextView2 != null) {
                                                                                            i = R.id.voiceMessage;
                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) pyb.a(view, i);
                                                                                            if (constraintLayout != null) {
                                                                                                i = R.id.voiceMessageUserButtonPlayPause;
                                                                                                ImageButton imageButton = (ImageButton) pyb.a(view, i);
                                                                                                if (imageButton != null) {
                                                                                                    i = R.id.voiceMessageUserSlider;
                                                                                                    Slider slider = (Slider) pyb.a(view, i);
                                                                                                    if (slider != null) {
                                                                                                        i = R.id.voiceTimeStamp;
                                                                                                        BubbleTimeTextView bubbleTimeTextView3 = (BubbleTimeTextView) pyb.a(view, i);
                                                                                                        if (bubbleTimeTextView3 != null) {
                                                                                                            return new EccItemUserTextWithFileBinding(relativeLayout, linearLayout, circularProgressButton, a, imageView, bubbleTimeTextView, bubbleMessageTextView, quoteMessageTextView, imageView2, frameLayout, frameLayout2, imageView3, frameLayout3, a2, quoteMessageTextView2, imageView4, quoteTimeTextView, tableRow, quoteAuthorTextView, tableRow2, relativeLayout, quoteTimeTextView2, bubbleMessageTextView2, bubbleTimeTextView2, quoteAuthorTextView2, constraintLayout, imageButton, slider, bubbleTimeTextView3);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccItemUserTextWithFileBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccItemUserTextWithFileBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_item_user_text_with_file, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
