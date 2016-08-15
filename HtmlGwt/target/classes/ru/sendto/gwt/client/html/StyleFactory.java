package ru.sendto.gwt.client.html;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.StyleInjector;

/**
 * <b> class names: </b><br />
 * abs<br />
 * hbox<br />
 * table<br />
 * fullBox<br />
 * fullWidth<br />
 * fullHeight<br />
 * 
 * @author lev
 *
 */
public class StyleFactory {

	//@formatter:off
	private String style = ""
			+ ".b,.button{"
				+ "font-weight: bold;"
			+ "}"
			+ ""
			+ ".margin2em,.button{"
				+ "margin:.2em;"
			+ "}"
			+ ""
			+ ".padding1,.button, .rmEvent, .addEvent{"
				+ "padding:.3em;"
			+ "}"
			+ ""
			+ ".abs, .atStart{"
				+ "position:absolute !important;"
			+ "}"
			+ ""
			+ ".atStart{"
				+ "top:0;"
				+ "left:0;"
			+ "}"
			+ ""
			+ ".air{"
				+ "width:0;"
				+ "height:0;"
				+ ""
			+ "}"
			+ ""
			+ ".table, .buttonPanel{"
				+ "display:table;"
			+ "}"
			+ ""
			+ ".table div{"
				+ "display:table-row;"
			+ "}"
			+ ""
			+ ".cell, .table div div, .button div, .innerCells *{"
				+ "display:table-cell;"
			+ "}"
			+ ""
			+ ".table div div div{"
				+ "display:block;"
			+ "}"
			+ ""
			+ ".fullWidth, .fullBox{"
				+ "width:100%;"
			+ "}"
			+ ""
			+ ".fullHeight, .fullBox{"
				+ "height:100%;"
			+ "}"
			+ ""
			+ ".step{"
				+ "width:32em;"
			+ "}"
			+ ""
			+ ".label{"
				+ "width:10em;"
			+ "}"
			+ ""
			+ ".hbox,.button{"
				+ "display:inline-block !important;"
			+ "}"
			+ ""
			+ ".off{"
				//+ "display: none !important;"
				+ "height:0px !important;"
				+ "opacity:0;"
			+ "}"
			+ ""
			+ ".indent, .indent *{"
				+ "padding-bottom:.5em;"
			+ "}"
			+ ""
			+ ".arrow, .button{"
				+ "cursor:default !important;"
			+ "}"
			+ ""
			+ ".vMiddle, .button div{"
				+ "vertical-align:middle !important;"
			+ "}"
			+ ""
			+ ".border, .button{"
				+ "border:1px solid #aaa;"
			+ "}"
			+ ".radius, .button{"
				+ "border-radius:4px;"
			+ "}"
			+ ".cRed, .button:HOVER{"
				+ "color:#522;"
			+ "}"
			+ ".bgGrey, .button{"
				+ "background-color:#eee"
			+ "}"
			+ ".boxShadow, .button:ACTIVE{"
				+ "box-shadow: black 0px 0px 3px;"
			+ "}"
			+ ""
			+ ".overflowHidden, .button{"
				+ "overflow: hidden;"
			+ "}"
			+ ""
			+ ".width3em{"
				+ "width:3em;"
			+ "}"
			+ ""
			+ ".widthAuto, .button:hover{"
				+ "width:auto;"
			+ "}"
			+ ""
			+ ".buttonPanel{"
				+ "position: fixed;"
				+ "width: 4.5em;"
				+ "height: 100%;"
			+ "}"
			+ ""
			+ ".block, [class^=\"icon-\"], [class*=\" icon-\"]{"
				+ "display:block !important;"
			+ "}"
			+ ""
			+ ".marginLeft4em{"
				+ "margin-left: 4em !important;"
			+ "}"
			+ ".paddingLeft05em, [class^=\"icon-\"] div, [class*=\" icon-\"] div{"
				+ "padding-left:.5em;"
			+ "}"
			+ ""
			+ ".noWrap, .button div{"
			+ "white-space:nowrap;"
			+ "}"
			+ ".floatRight,.rmEvent{"
				+ "float:right !important; "
			+ "}"
				+ ".halfFont, .rmEvent,.addEvent{"
				+ "font-size:.4em !important;"
			+ "}"
			+ ".doubleFont{"
				+ "font-size:2em !important;"
			+ "}"
			+ ""
			+ ".marginLeft4em{"
				+ "margin-left:4em;"
			+ "}"
			+ ""
			+ ".rmEvent{"
			+ "}"
			+ ""
			+ ".bgEEE, .zebra:nth-child(2n+1){"
				+ "background-color:#EEE;"
			+ "}"
			+ ""
			+ ".bgDDD, .zebra:nth-child(2n){"
				+ "background-color:#DDD;"
			+ "}"
			+ ""
			+ ".zebra{"
			+ "}";
	
	String input = ""
			+ "div.textBox input{"
				+ "font-size: 12pt;"
				+ "width: 20em;"
				+ "padding: 0 .2em;"
			+ "}"
			+ ""
			+ "div.textBox + div{"
				+ "cursor: text;"
				+ "color:#777;"
				+ "margin-left: 1px;"
				+ "margin-right: .5em;"
				+ "width: 20em;"
				+ "font-size: 12pt;"
				+ "padding: 0 .2em;"
			+ "}";
	//@formatter:on
	
	private StyleFactory() {
		// TODO FIXME Asyc to DB
		StyleInjector.inject(getStyle());
	}

	public static StyleFactory get() {
		return GWT.create(StyleFactory.class);
	}

	public String getStyle() {
		return style+input;
	}

	public void setStyle(String style) {
		this.style = style;
	}

}
