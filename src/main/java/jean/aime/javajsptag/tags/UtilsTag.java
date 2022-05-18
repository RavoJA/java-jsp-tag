package jean.aime.javajsptag.tags;

import org.jetbrains.annotations.NotNull;
import org.springframework.util.StringUtils;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;


public class UtilsTag extends TagSupport {
    private String inputstring;

    public String getInputstring() {
        return inputstring;
    }

    public void setInputstring(String inputstring) {
        this.inputstring = inputstring;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            out.println(inputstring.isEmpty());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }

    public static Boolean isNullOrEmpty(@NotNull String inputstring) {
        return inputstring.isEmpty();
    }
}
