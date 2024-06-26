package ch.qos.logback.core.joran.event;

import org.xml.sax.Locator;
/* loaded from: classes.dex */
public class BodyEvent extends SaxEvent {
    private String text;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BodyEvent(String str, Locator locator) {
        super(null, null, null, locator);
        this.text = str;
    }

    public void append(String str) {
        this.text += str;
    }

    public String getText() {
        String str = this.text;
        if (str != null) {
            return str.trim();
        }
        return str;
    }

    public String toString() {
        return "BodyEvent(" + getText() + ")" + this.locator.getLineNumber() + "," + this.locator.getColumnNumber();
    }
}
