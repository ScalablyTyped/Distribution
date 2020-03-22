package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderradiusbottomleft extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. Requires Legend. Used only inside individual
    *  series rather than Plot. See red text in upper right box. Works with output flash. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the rotation angle of the object/shape. Requires Legend. Used only inside individual series rather than Plot. See red text in
    *  upper right box. Works with output canvas and svg. -45 | 115 | ...
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g. "red", "blue", "yellow"), in hexadecimal notation (e.
    * g. "#FF0000", "#0000FF", "#FFFF00"), or in RGB notation (e.g. "rgb(255,0,0)", "rgb(0,0,255)", "rgb(255,255,0)"). Requires Legend.
    * Used only inside individual series rather than Plot. See red text in upper right box. "none" | "transparent" | "#f00" | "#f00 #00f
    * " | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the first color of a 2 color background gradient of the object. To be used with background-color-2. Requires Legend. Used onl
    * y inside individual series rather than Plot. See red text in upper right box. "none" | "transparent" | "#f00" | "#f00 #00f" | "red
    *  yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-1`: js.UndefOr[String] = js.undefined
  /**
    * Sets the second color of a 2 color background gradient of the object. To be used with background-color-1. Requires Legend. Used on
    * ly inside individual series rather than Plot. See red text in upper right box. "none" | "transparent" | "#f00" | "#f00 #00f" | "re
    * d yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color-2`: js.UndefOr[String] = js.undefined
  /**
    * Sets the direction/s on which the background image is being "stretched". Requires Legend. Used only inside individual series rathe
    * r than Plot. See red text in upper right box. "x" | "y" | "xy"
    */
  var `background-fit`: js.UndefOr[String] = js.undefined
  /**
    * Sets a background image for the object. Value can be a local file or a web image's location. Requires Legend. Used only inside ind
    * ividual series rather than Plot. See red text in upper right box. "image.png" | ...
    */
  var `background-image`: js.UndefOr[String] = js.undefined
  /**
    * Sets the position of the background when the background-repeat value is no-repeat. Requires Legend. Used only inside individual se
    * ries rather than Plot. See red text in upper right box. "0 0" | "50 100" | "80% 60%" | ...
    */
  var `background-position`: js.UndefOr[String] = js.undefined
  /**
    * Sets the repeating mode for the background image. Requires Legend. Used only inside individual series rather than Plot. See red te
    * xt in upper right box. "no-repeat" | "repeat" | "repeat-x" | "repeat-y"
    */
  var `background-repeat`: js.UndefOr[String] = js.undefined
  /**
    * Sets whether the text is displayed with bold characters or not. Requires Legend. Used only inside individual series rather than Pl
    * ot. See red text in upper right box. true | false | 1 | 0
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the object's bottom border style. Accepts solid, dashed, and dotted styles. Requires Legend. Used only inside individual seri
    * es rather than Plot. See red text in upper right box. "2px solid #f00" | ...
    */
  var `border-bottom`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border color of the object. Requires Legend. Used only inside individual series rather than Plot. See red text in upper r
    * ight box. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the object's left border style. Accepts solid, dashed, and dotted styles. Requires Legend. Used only inside individual series
    *  rather than Plot. See red text in upper right box. "2px solid #f00" | ...
    */
  var `border-left`: js.UndefOr[String] = js.undefined
  /**
    * Sets the object's border radius, for rounded corners. Larger values create rounder corners, while smaller values create sharper co
    * rners. A single value will affect all 4 corners, while multiple values will have separate effects on each corner, with the first v
    * alue affecting the top-left corner, the second value affecting the top-right corner, and so on, in a clockwise direction. Requires
    *  Legend. Used only inside individual series rather than Plot. See red text in upper right box. 4 | "6px" | "6px 10px 3px 5px" | "-
    * 10px" | ...
    */
  var `border-radius`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's bottom-left border radius, for rounded corners. Larger values create rounder corners, while smaller values creat
    * e sharper corners. A negative value will cut a corner off without rounding. Requires Legend. Used only inside individual series ra
    * ther than Plot. See red text in upper right box. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-left`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's bottom-right border radius, for rounded corners. Larger values create rounder corners, while smaller values crea
    * te sharper corners. A negative value will cut a corner off without rounding. Requires Legend. Used only inside individual series r
    * ather than Plot. See red text in upper right box. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-bottom-right`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's top-left border radius, for rounded corners. Larger values create rounder corners, while smaller values create s
    * harper corners. A negative value will cut a corner off without rounding. Requires Legend. Used only inside individual series rathe
    * r than Plot. See red text in upper right box. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-left`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's top-right border radius, for rounded corners. Larger values create rounder corners, while smaller values create
    * sharper corners. A negative value will cut a corner off without rounding. Requires Legend. Used only inside individual series rath
    * er than Plot. See red text in upper right box. 4 | "6px" | "-6px" | -4 | ...
    */
  var `border-radius-top-right`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's right border style. Accepts solid, dashed, and dotted styles. Requires Legend. Used only inside individual serie
    * s rather than Plot. See red text in upper right box. "2px solid #f00" | ...
    */
  var `border-right`: js.UndefOr[String] = js.undefined
  /**
    * Sets the object's top border style. Values must include the border width, style, and color. Accepts solid, dashed, and dotted styl
    * es. Requires Legend. Used only inside individual series rather than Plot. See red text in upper right box. "2px solid #f00" | ...
    */
  var `border-top`: js.UndefOr[String] = js.undefined
  /**
    * Sets the border width of the object. Requires Legend. Used only inside individual series rather than Plot. See red text in upper r
    * ight box. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets whether an object will have a callout arrow or not. Requires Legend. Used only inside individual series rather than Plot. See
    *  red text in upper right box. Works with output canvas and svg. true | false | 1 | 0
    */
  var callout: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the length of the extension that extends beyond the tip of the callout arrow. Requires Legend. Used only inside individual se
    * ries rather than Plot. See red text in upper right box. Works with output canvas and svg. 4 | "6px" | ...
    */
  var `callout-extension`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the height of the object's callout arrow. A larger value will create a taller callout arrow. Requires Legend. Used only insid
    * e individual series rather than Plot. See red text in upper right box. Works with output canvas and svg. 4 | "6px" | ...
    */
  var `callout-height`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the point of the tip of the callout arrow to a specified coordinate on the chart, with the starting point of [0,0] being the
    * top left corner of the chart.. Requires Legend. Used only inside individual series rather than Plot. See red text in upper right b
    * ox. Works with output canvas and svg. [200, 50] | ...
    */
  var `callout-hook`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the offset along the callout direction of the arrow's base. Positive and negative values can be used to offset the callout ar
    * row up, down, left, or right depending on the callout-position. Requires Legend. Used only inside individual series rather than Pl
    * ot. See red text in upper right box. Works with output canvas and svg. 4 | "6px" | ...
    */
  var `callout-offset`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the position for the object's callout arrow. The position is "bottom" by default. Requires Legend. Used only inside individua
    * l series rather than Plot. See red text in upper right box. Works with output canvas and svg. "top" | "right" | "bottom" | "left"
    */
  var `callout-position`: js.UndefOr[String] = js.undefined
  /**
    * Sets the width of the object's callout arrow. A larger value will create a wider callout arrow. Requires Legend. Used only inside
    * individual series rather than Plot. See red text in upper right box. Works with output canvas and svg. 4 | "6px" | ...
    */
  var `callout-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the color of the text in the legend box. Requires Legend. Used only inside individual series rather than Plot. See red text i
    * n upper right box. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Sets the style of the cursor when hovering over a node. "hand" | "normal"
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * Sets the angle of the axis along which the linear gradient is drawn. Requires Legend. Used only inside individual series rather th
    * an Plot. See red text in upper right box. Works with output canvas and svg. -45 | 115 | ...
    */
  var `fill-angle`: js.UndefOr[Double] = js.undefined
  /**
    * Sets an X offset to apply to the fill. Requires Legend. Used only inside individual series rather than Plot. See red text in upper
    *  right box. Works with output canvas and svg. 4 | "6px" | ...
    */
  var `fill-offset-x`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets an Y offset to apply to the fill. Requires Legend. Used only inside individual series rather than Plot. See red text in upper
    *  right box. Works with output canvas and svg. 4 | "6px" | ...
    */
  var `fill-offset-y`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the background gradient fill type to either linear or radial. Requires Legend. Used only inside individual series rather than
    *  Plot. See red text in upper right box. Works with output canvas and svg. "linear" | "radial"
    */
  var `fill-type`: js.UndefOr[String] = js.undefined
  /**
    * Sets the object's font angle. A positive value will rotate the object by that number of degrees clockwise, while a negative value
    * will rotate the object by that number of degrees counter-clockwise. For the text in the legend box. Requires Legend. Used only ins
    * ide individual series rather than Plot. See red text in upper right box. -45 | 115 | ...
    */
  var `font-angle`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the font color of the text in the legend box. Works like color. Requires Legend. Used only inside individual series rather th
    * an Plot. See red text in upper right box. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `font-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the text's font family in the legend box. Requires Legend. Used only inside individual series rather than Plot. See red text
    * in upper right box. "Arial" | "Tahoma,Verdana" | ...
    */
  var `font-family`: js.UndefOr[String] = js.undefined
  /**
    * Sets the text's font size in the legend box. Requires Legend. Used only inside individual series rather than Plot. See red text in
    *  upper right box. 4 | "6px" | ...
    */
  var `font-size`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the text's font style in the legend box. Requires Legend. Used only inside individual series rather than Plot. See red text i
    * n upper right box. "none" | "italic" | "oblique"
    */
  var `font-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets the text's font weight in the legend box. Similar to bold. Requires Legend. Used only inside individual series rather than Pl
    * ot. See red text in upper right box. "normal" | "bold"
    */
  var `font-weight`: js.UndefOr[String] = js.undefined
  /**
    * Sets a set of colors for a complex background gradient consisting of 2 or more colors. To be used with gradient-stops. Requires Le
    * gend. Used only inside individual series rather than Plot. See red text in upper right box. Works with output canvas and svg. "#f0
    * 0 #0f0 #00f" | ...
    */
  var `gradient-colors`: js.UndefOr[String] = js.undefined
  /**
    * Sets the gradient stops for a complex background gradient consisting of 2 or more colors. To be used with gradient-colors. Require
    * s Legend. Used only inside individual series rather than Plot. See red text in upper right box. Works with output canvas and svg.
    * "0.1 0.5 0.9" | ...
    */
  var `gradient-stops`: js.UndefOr[String] = js.undefined
  /**
    * Sets the object's height. Requires Legend. Used only inside individual series rather than Plot. See red text in upper right box. W
    * orks with output canvas and svg. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets whether the text is displayed with italic characters or not. For the legend box. Similar to font-style. Requires Legend. Used
    *  only inside individual series rather than Plot. See red text in upper right box. true | false | 1 | 0
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the object's margins. Requires Legend. Used only inside individual series rather than Plot. See red text in upper right box.
    * Works with output canvas and svg. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var margin: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's bottom margin. Requires Legend. Used only inside individual series rather than Plot. See red text in upper right
    *  box. Works with output canvas and svg. 4 | "6px" | ...
    */
  var `margin-bottom`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's left margin. Requires Legend. Used only inside individual series rather than Plot. See red text in upper right b
    * ox. Works with output canvas and svg. 4 | "6px" | ...
    */
  var `margin-left`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's right margin. Requires Legend. Used only inside individual series rather than Plot. See red text in upper right
    * box. Works with output canvas and svg. 4 | "6px" | ...
    */
  var `margin-right`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's top margin. Requires Legend. Used only inside individual series rather than Plot. See red text in upper right bo
    * x. Works with output canvas and svg. 4 | "6px" | ...
    */
  var `margin-top`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the maximum numbers of characters displayed in the object. The value determines how many characters will be displayed before
    * the text is cut and appended with "..." Requires Legend. Used only inside individual series rather than Plot. See red text in uppe
    * r right box. 5 | 10 | ...
    */
  var `max-chars`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the maximum width of the text box. If text is longer than the max-width value, it will overlap the box or will wrap if wrap-t
    * ext is set to true. Requires Legend. Used only inside individual series rather than Plot. See red text in upper right box. Works w
    * ith output canvas and svg. 10 | "20px" | 0.3 | "30%" | ...
    */
  var `max-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets an X offset to apply when positioning the object/shape. Requires Legend. Used only inside individual series rather than Plot.
    *  See red text in upper right box. Works with output canvas and svg. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets an Y offset to apply when positioning the object/shape. Requires Legend. Used only inside individual series rather than Plot.
    *  See red text in upper right box. Works with output canvas and svg. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.undefined
  /**
    * To specify the order of the legend items in the legend. 1 | 2 | 3 | 4 | ...
    */
  var order: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's padding around the text. Up to four values can be entered to set the padding for all four sides, starting with t
    * he top and going clockwise. Requires Legend. Used only inside individual series rather than Plot. See red text in upper right box.
    *  10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var padding: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's bottom padding around the text. For single item in Legend. Requires Legend. Used only inside individual series r
    * ather than Plot. See red text in upper right box. 4 | "6px" | ...
    */
  var `padding-bottom`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's left padding around the text. For single item in Legend. Requires Legend. Used only inside individual series rat
    * her than Plot. See red text in upper right box. 4 | "6px" | ...
    */
  var `padding-left`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's right padding around the text. For single item in Legend. Requires Legend. Used only inside individual series ra
    * ther than Plot. See red text in upper right box. 4 | "6px" | ...
    */
  var `padding-right`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's top padding around the text. For single item in Legend. Requires Legend. Used only inside individual series rath
    * er than Plot. See red text in upper right box. 4 | "6px" | ...
    */
  var `padding-top`: js.UndefOr[js.Any] = js.undefined
  /**
    * Renders text right-to-left. Default value is false. true | false | 1 | 0
    */
  @JSName("rtl (right-to-left)")
  var `rtl Leftparenthesisright-to-leftRightparenthesis`: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets whether the object's shadow is visible or not. For single item in Legend. Requires Legend. Used only inside individual series
    *  rather than Plot. See red text in upper right box. Works with output flash. Has limited effect on HTML5 implementation. true | fa
    * lse | 1 | 0
    */
  var shadow: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the transparency of the shadow of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and
    * 1.0 being completely opaque. Please note that values also require the leading 0 before the decimal. For single item in Legend. Req
    * uires Legend. Used only inside individual series rather than Plot. See red text in upper right box. Works with output flash. Has l
    * imited effect on HTML5 implementation. 0.3 | 0.9 | ...
    */
  var `shadow-alpha`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the angle of the shadow underneath the object. For single item in Legend. Requires Legend. Used only inside individual series
    *  rather than Plot. See red text in upper right box. Works with output flash. Has limited effect on HTML5 implementation. -45 | 115
    *  | ...
    */
  var `shadow-angle`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the blur effect size for the shadow of the object. For single item in Legend. Requires Legend. Used only inside individual se
    * ries rather than Plot. See red text in upper right box. Works with output flash. Has limited effect on HTML5 implementation. 4 | "
    * 6px" | ...
    */
  var `shadow-blur`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the color of the shadow of the object. For single item in Legend. Requires Legend. Used only inside individual series rather
    * than Plot. See red text in upper right box. Works with output flash. Has limited effect on HTML5 implementation. "none" | "transpa
    * rent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `shadow-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the distance between the shadow and the object. For single item in Legend. Requires Legend. Used only inside individual serie
    * s rather than Plot. See red text in upper right box. Works with output flash. Has limited effect on HTML5 implementation. 4 | "6px
    * " | ...
    */
  var `shadow-distance`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the size of the object/shape. 4 | "6px" | ...
    */
  var size: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the text content of the object. For single item in Legend. Requires Legend. Used only inside individual series rather than Pl
    * ot. See red text in upper right box. "Some Text" | ...
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Sets the text's horizontal alignment relative to the object's box. For single item in Legend. Requires Legend. Used only inside in
    * dividual series rather than Plot. See red text in upper right box. "left" | "center" | "right"
    */
  var `text-align`: js.UndefOr[String] = js.undefined
  /**
    * Sets the text's transparency independent of the object's transparency. Value must be between 0.0 and 1.0, with 0.0 being 100% tran
    * sparent and 1.0 being 100% opaque. The leading 0 before the decimal is required. For single item in Legend. Requires Legend. Used
    * only inside individual series rather than Plot. See red text in upper right box. 0.3 | 0.9 | ...
    */
  var `text-alpha`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the text's decoration. Similar to underline. For single item in Legend. Requires Legend. Used only inside individual series r
    * ather than Plot. See red text in upper right box. Use output canvas or flash. "none" | "underline"
    */
  var `text-decoration`: js.UndefOr[String] = js.undefined
  /**
    * Sets whether the text is displayed with underlined characters or not. For single item in Legend. Requires Legend. Used only inside
    *  individual series rather than Plot. See red text in upper right box. Use output canvas or flash. true | false | 1 | 0
    */
  var underline: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets whether the text will wrap, depending on the width of the object. For single item in Legend. Requires Legend. Used only insid
    * e individual series rather than Plot. See red text in upper right box. Use output canvas or flash. "top" | "middle" | "bottom"
    */
  var `vertical-align`: js.UndefOr[String] = js.undefined
  /**
    * Sets the visibility of the object. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the object's width. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets whether the text will wrap, depending on the width of the object. See red text in upper right box. Use output canvas or flash
    * . true | false | 1 | 0
    */
  var `wrap-text`: js.UndefOr[Boolean] = js.undefined
}

object AnonBorderradiusbottomleft {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    angle: Int | Double = null,
    `background-color`: String = null,
    `background-color-1`: String = null,
    `background-color-2`: String = null,
    `background-fit`: String = null,
    `background-image`: String = null,
    `background-position`: String = null,
    `background-repeat`: String = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    `border-bottom`: String = null,
    `border-color`: String = null,
    `border-left`: String = null,
    `border-radius`: js.Any = null,
    `border-radius-bottom-left`: js.Any = null,
    `border-radius-bottom-right`: js.Any = null,
    `border-radius-top-left`: js.Any = null,
    `border-radius-top-right`: js.Any = null,
    `border-right`: String = null,
    `border-top`: String = null,
    `border-width`: js.Any = null,
    callout: js.UndefOr[Boolean] = js.undefined,
    `callout-extension`: js.Any = null,
    `callout-height`: js.Any = null,
    `callout-hook`: js.Any = null,
    `callout-offset`: js.Any = null,
    `callout-position`: String = null,
    `callout-width`: js.Any = null,
    color: String = null,
    cursor: String = null,
    `fill-angle`: Int | Double = null,
    `fill-offset-x`: js.Any = null,
    `fill-offset-y`: js.Any = null,
    `fill-type`: String = null,
    `font-angle`: Int | Double = null,
    `font-color`: String = null,
    `font-family`: String = null,
    `font-size`: js.Any = null,
    `font-style`: String = null,
    `font-weight`: String = null,
    `gradient-colors`: String = null,
    `gradient-stops`: String = null,
    height: js.Any = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    margin: js.Any = null,
    `margin-bottom`: js.Any = null,
    `margin-left`: js.Any = null,
    `margin-right`: js.Any = null,
    `margin-top`: js.Any = null,
    `max-chars`: Int | Double = null,
    `max-width`: js.Any = null,
    `offset-x`: js.Any = null,
    `offset-y`: js.Any = null,
    order: js.Any = null,
    padding: js.Any = null,
    `padding-bottom`: js.Any = null,
    `padding-left`: js.Any = null,
    `padding-right`: js.Any = null,
    `padding-top`: js.Any = null,
    `rtl Leftparenthesisright-to-leftRightparenthesis`: js.UndefOr[Boolean] = js.undefined,
    shadow: js.UndefOr[Boolean] = js.undefined,
    `shadow-alpha`: Int | Double = null,
    `shadow-angle`: Int | Double = null,
    `shadow-blur`: js.Any = null,
    `shadow-color`: String = null,
    `shadow-distance`: js.Any = null,
    size: js.Any = null,
    text: String = null,
    `text-align`: String = null,
    `text-alpha`: Int | Double = null,
    `text-decoration`: String = null,
    underline: js.UndefOr[Boolean] = js.undefined,
    `vertical-align`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.Any = null,
    `wrap-text`: js.UndefOr[Boolean] = js.undefined
  ): AnonBorderradiusbottomleft = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`background-color-1` != null) __obj.updateDynamic("background-color-1")(`background-color-1`.asInstanceOf[js.Any])
    if (`background-color-2` != null) __obj.updateDynamic("background-color-2")(`background-color-2`.asInstanceOf[js.Any])
    if (`background-fit` != null) __obj.updateDynamic("background-fit")(`background-fit`.asInstanceOf[js.Any])
    if (`background-image` != null) __obj.updateDynamic("background-image")(`background-image`.asInstanceOf[js.Any])
    if (`background-position` != null) __obj.updateDynamic("background-position")(`background-position`.asInstanceOf[js.Any])
    if (`background-repeat` != null) __obj.updateDynamic("background-repeat")(`background-repeat`.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (`border-bottom` != null) __obj.updateDynamic("border-bottom")(`border-bottom`.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-left` != null) __obj.updateDynamic("border-left")(`border-left`.asInstanceOf[js.Any])
    if (`border-radius` != null) __obj.updateDynamic("border-radius")(`border-radius`.asInstanceOf[js.Any])
    if (`border-radius-bottom-left` != null) __obj.updateDynamic("border-radius-bottom-left")(`border-radius-bottom-left`.asInstanceOf[js.Any])
    if (`border-radius-bottom-right` != null) __obj.updateDynamic("border-radius-bottom-right")(`border-radius-bottom-right`.asInstanceOf[js.Any])
    if (`border-radius-top-left` != null) __obj.updateDynamic("border-radius-top-left")(`border-radius-top-left`.asInstanceOf[js.Any])
    if (`border-radius-top-right` != null) __obj.updateDynamic("border-radius-top-right")(`border-radius-top-right`.asInstanceOf[js.Any])
    if (`border-right` != null) __obj.updateDynamic("border-right")(`border-right`.asInstanceOf[js.Any])
    if (`border-top` != null) __obj.updateDynamic("border-top")(`border-top`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (!js.isUndefined(callout)) __obj.updateDynamic("callout")(callout.asInstanceOf[js.Any])
    if (`callout-extension` != null) __obj.updateDynamic("callout-extension")(`callout-extension`.asInstanceOf[js.Any])
    if (`callout-height` != null) __obj.updateDynamic("callout-height")(`callout-height`.asInstanceOf[js.Any])
    if (`callout-hook` != null) __obj.updateDynamic("callout-hook")(`callout-hook`.asInstanceOf[js.Any])
    if (`callout-offset` != null) __obj.updateDynamic("callout-offset")(`callout-offset`.asInstanceOf[js.Any])
    if (`callout-position` != null) __obj.updateDynamic("callout-position")(`callout-position`.asInstanceOf[js.Any])
    if (`callout-width` != null) __obj.updateDynamic("callout-width")(`callout-width`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (`fill-angle` != null) __obj.updateDynamic("fill-angle")(`fill-angle`.asInstanceOf[js.Any])
    if (`fill-offset-x` != null) __obj.updateDynamic("fill-offset-x")(`fill-offset-x`.asInstanceOf[js.Any])
    if (`fill-offset-y` != null) __obj.updateDynamic("fill-offset-y")(`fill-offset-y`.asInstanceOf[js.Any])
    if (`fill-type` != null) __obj.updateDynamic("fill-type")(`fill-type`.asInstanceOf[js.Any])
    if (`font-angle` != null) __obj.updateDynamic("font-angle")(`font-angle`.asInstanceOf[js.Any])
    if (`font-color` != null) __obj.updateDynamic("font-color")(`font-color`.asInstanceOf[js.Any])
    if (`font-family` != null) __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    if (`font-size` != null) __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    if (`font-style` != null) __obj.updateDynamic("font-style")(`font-style`.asInstanceOf[js.Any])
    if (`font-weight` != null) __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    if (`gradient-colors` != null) __obj.updateDynamic("gradient-colors")(`gradient-colors`.asInstanceOf[js.Any])
    if (`gradient-stops` != null) __obj.updateDynamic("gradient-stops")(`gradient-stops`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (`margin-bottom` != null) __obj.updateDynamic("margin-bottom")(`margin-bottom`.asInstanceOf[js.Any])
    if (`margin-left` != null) __obj.updateDynamic("margin-left")(`margin-left`.asInstanceOf[js.Any])
    if (`margin-right` != null) __obj.updateDynamic("margin-right")(`margin-right`.asInstanceOf[js.Any])
    if (`margin-top` != null) __obj.updateDynamic("margin-top")(`margin-top`.asInstanceOf[js.Any])
    if (`max-chars` != null) __obj.updateDynamic("max-chars")(`max-chars`.asInstanceOf[js.Any])
    if (`max-width` != null) __obj.updateDynamic("max-width")(`max-width`.asInstanceOf[js.Any])
    if (`offset-x` != null) __obj.updateDynamic("offset-x")(`offset-x`.asInstanceOf[js.Any])
    if (`offset-y` != null) __obj.updateDynamic("offset-y")(`offset-y`.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (`padding-bottom` != null) __obj.updateDynamic("padding-bottom")(`padding-bottom`.asInstanceOf[js.Any])
    if (`padding-left` != null) __obj.updateDynamic("padding-left")(`padding-left`.asInstanceOf[js.Any])
    if (`padding-right` != null) __obj.updateDynamic("padding-right")(`padding-right`.asInstanceOf[js.Any])
    if (`padding-top` != null) __obj.updateDynamic("padding-top")(`padding-top`.asInstanceOf[js.Any])
    if (!js.isUndefined(`rtl Leftparenthesisright-to-leftRightparenthesis`)) __obj.updateDynamic("rtl (right-to-left)")(`rtl Leftparenthesisright-to-leftRightparenthesis`.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (`shadow-alpha` != null) __obj.updateDynamic("shadow-alpha")(`shadow-alpha`.asInstanceOf[js.Any])
    if (`shadow-angle` != null) __obj.updateDynamic("shadow-angle")(`shadow-angle`.asInstanceOf[js.Any])
    if (`shadow-blur` != null) __obj.updateDynamic("shadow-blur")(`shadow-blur`.asInstanceOf[js.Any])
    if (`shadow-color` != null) __obj.updateDynamic("shadow-color")(`shadow-color`.asInstanceOf[js.Any])
    if (`shadow-distance` != null) __obj.updateDynamic("shadow-distance")(`shadow-distance`.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`text-align` != null) __obj.updateDynamic("text-align")(`text-align`.asInstanceOf[js.Any])
    if (`text-alpha` != null) __obj.updateDynamic("text-alpha")(`text-alpha`.asInstanceOf[js.Any])
    if (`text-decoration` != null) __obj.updateDynamic("text-decoration")(`text-decoration`.asInstanceOf[js.Any])
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    if (`vertical-align` != null) __obj.updateDynamic("vertical-align")(`vertical-align`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(`wrap-text`)) __obj.updateDynamic("wrap-text")(`wrap-text`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderradiusbottomleft]
  }
}

