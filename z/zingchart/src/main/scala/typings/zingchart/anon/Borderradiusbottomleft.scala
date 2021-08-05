package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Borderradiusbottomleft extends StObject {
  
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
object Borderradiusbottomleft {
  
  inline def apply(): Borderradiusbottomleft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Borderradiusbottomleft]
  }
  
  extension [Self <: Borderradiusbottomleft](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    inline def `setBackground-color-1`(value: String): Self = StObject.set(x, "background-color-1", value.asInstanceOf[js.Any])
    
    inline def `setBackground-color-1Undefined`: Self = StObject.set(x, "background-color-1", js.undefined)
    
    inline def `setBackground-color-2`(value: String): Self = StObject.set(x, "background-color-2", value.asInstanceOf[js.Any])
    
    inline def `setBackground-color-2Undefined`: Self = StObject.set(x, "background-color-2", js.undefined)
    
    inline def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    inline def `setBackground-fit`(value: String): Self = StObject.set(x, "background-fit", value.asInstanceOf[js.Any])
    
    inline def `setBackground-fitUndefined`: Self = StObject.set(x, "background-fit", js.undefined)
    
    inline def `setBackground-image`(value: String): Self = StObject.set(x, "background-image", value.asInstanceOf[js.Any])
    
    inline def `setBackground-imageUndefined`: Self = StObject.set(x, "background-image", js.undefined)
    
    inline def `setBackground-position`(value: String): Self = StObject.set(x, "background-position", value.asInstanceOf[js.Any])
    
    inline def `setBackground-positionUndefined`: Self = StObject.set(x, "background-position", js.undefined)
    
    inline def `setBackground-repeat`(value: String): Self = StObject.set(x, "background-repeat", value.asInstanceOf[js.Any])
    
    inline def `setBackground-repeatUndefined`: Self = StObject.set(x, "background-repeat", js.undefined)
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def `setBorder-bottom`(value: String): Self = StObject.set(x, "border-bottom", value.asInstanceOf[js.Any])
    
    inline def `setBorder-bottomUndefined`: Self = StObject.set(x, "border-bottom", js.undefined)
    
    inline def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    inline def `setBorder-left`(value: String): Self = StObject.set(x, "border-left", value.asInstanceOf[js.Any])
    
    inline def `setBorder-leftUndefined`: Self = StObject.set(x, "border-left", js.undefined)
    
    inline def `setBorder-radius`(value: js.Any): Self = StObject.set(x, "border-radius", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius-bottom-left`(value: js.Any): Self = StObject.set(x, "border-radius-bottom-left", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius-bottom-leftUndefined`: Self = StObject.set(x, "border-radius-bottom-left", js.undefined)
    
    inline def `setBorder-radius-bottom-right`(value: js.Any): Self = StObject.set(x, "border-radius-bottom-right", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius-bottom-rightUndefined`: Self = StObject.set(x, "border-radius-bottom-right", js.undefined)
    
    inline def `setBorder-radius-top-left`(value: js.Any): Self = StObject.set(x, "border-radius-top-left", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius-top-leftUndefined`: Self = StObject.set(x, "border-radius-top-left", js.undefined)
    
    inline def `setBorder-radius-top-right`(value: js.Any): Self = StObject.set(x, "border-radius-top-right", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius-top-rightUndefined`: Self = StObject.set(x, "border-radius-top-right", js.undefined)
    
    inline def `setBorder-radiusUndefined`: Self = StObject.set(x, "border-radius", js.undefined)
    
    inline def `setBorder-right`(value: String): Self = StObject.set(x, "border-right", value.asInstanceOf[js.Any])
    
    inline def `setBorder-rightUndefined`: Self = StObject.set(x, "border-right", js.undefined)
    
    inline def `setBorder-top`(value: String): Self = StObject.set(x, "border-top", value.asInstanceOf[js.Any])
    
    inline def `setBorder-topUndefined`: Self = StObject.set(x, "border-top", js.undefined)
    
    inline def `setBorder-width`(value: js.Any): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    inline def setCallout(value: Boolean): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    inline def `setCallout-extension`(value: js.Any): Self = StObject.set(x, "callout-extension", value.asInstanceOf[js.Any])
    
    inline def `setCallout-extensionUndefined`: Self = StObject.set(x, "callout-extension", js.undefined)
    
    inline def `setCallout-height`(value: js.Any): Self = StObject.set(x, "callout-height", value.asInstanceOf[js.Any])
    
    inline def `setCallout-heightUndefined`: Self = StObject.set(x, "callout-height", js.undefined)
    
    inline def `setCallout-hook`(value: js.Any): Self = StObject.set(x, "callout-hook", value.asInstanceOf[js.Any])
    
    inline def `setCallout-hookUndefined`: Self = StObject.set(x, "callout-hook", js.undefined)
    
    inline def `setCallout-offset`(value: js.Any): Self = StObject.set(x, "callout-offset", value.asInstanceOf[js.Any])
    
    inline def `setCallout-offsetUndefined`: Self = StObject.set(x, "callout-offset", js.undefined)
    
    inline def `setCallout-position`(value: String): Self = StObject.set(x, "callout-position", value.asInstanceOf[js.Any])
    
    inline def `setCallout-positionUndefined`: Self = StObject.set(x, "callout-position", js.undefined)
    
    inline def `setCallout-width`(value: js.Any): Self = StObject.set(x, "callout-width", value.asInstanceOf[js.Any])
    
    inline def `setCallout-widthUndefined`: Self = StObject.set(x, "callout-width", js.undefined)
    
    inline def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def `setFill-angle`(value: Double): Self = StObject.set(x, "fill-angle", value.asInstanceOf[js.Any])
    
    inline def `setFill-angleUndefined`: Self = StObject.set(x, "fill-angle", js.undefined)
    
    inline def `setFill-offset-x`(value: js.Any): Self = StObject.set(x, "fill-offset-x", value.asInstanceOf[js.Any])
    
    inline def `setFill-offset-xUndefined`: Self = StObject.set(x, "fill-offset-x", js.undefined)
    
    inline def `setFill-offset-y`(value: js.Any): Self = StObject.set(x, "fill-offset-y", value.asInstanceOf[js.Any])
    
    inline def `setFill-offset-yUndefined`: Self = StObject.set(x, "fill-offset-y", js.undefined)
    
    inline def `setFill-type`(value: String): Self = StObject.set(x, "fill-type", value.asInstanceOf[js.Any])
    
    inline def `setFill-typeUndefined`: Self = StObject.set(x, "fill-type", js.undefined)
    
    inline def `setFont-angle`(value: Double): Self = StObject.set(x, "font-angle", value.asInstanceOf[js.Any])
    
    inline def `setFont-angleUndefined`: Self = StObject.set(x, "font-angle", js.undefined)
    
    inline def `setFont-color`(value: String): Self = StObject.set(x, "font-color", value.asInstanceOf[js.Any])
    
    inline def `setFont-colorUndefined`: Self = StObject.set(x, "font-color", js.undefined)
    
    inline def `setFont-family`(value: String): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    inline def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    inline def `setFont-size`(value: js.Any): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    
    inline def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
    
    inline def `setFont-style`(value: String): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
    
    inline def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
    
    inline def `setFont-weight`(value: String): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    inline def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    inline def `setGradient-colors`(value: String): Self = StObject.set(x, "gradient-colors", value.asInstanceOf[js.Any])
    
    inline def `setGradient-colorsUndefined`: Self = StObject.set(x, "gradient-colors", js.undefined)
    
    inline def `setGradient-stops`(value: String): Self = StObject.set(x, "gradient-stops", value.asInstanceOf[js.Any])
    
    inline def `setGradient-stopsUndefined`: Self = StObject.set(x, "gradient-stops", js.undefined)
    
    inline def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setMargin(value: js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def `setMargin-bottom`(value: js.Any): Self = StObject.set(x, "margin-bottom", value.asInstanceOf[js.Any])
    
    inline def `setMargin-bottomUndefined`: Self = StObject.set(x, "margin-bottom", js.undefined)
    
    inline def `setMargin-left`(value: js.Any): Self = StObject.set(x, "margin-left", value.asInstanceOf[js.Any])
    
    inline def `setMargin-leftUndefined`: Self = StObject.set(x, "margin-left", js.undefined)
    
    inline def `setMargin-right`(value: js.Any): Self = StObject.set(x, "margin-right", value.asInstanceOf[js.Any])
    
    inline def `setMargin-rightUndefined`: Self = StObject.set(x, "margin-right", js.undefined)
    
    inline def `setMargin-top`(value: js.Any): Self = StObject.set(x, "margin-top", value.asInstanceOf[js.Any])
    
    inline def `setMargin-topUndefined`: Self = StObject.set(x, "margin-top", js.undefined)
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def `setMax-chars`(value: Double): Self = StObject.set(x, "max-chars", value.asInstanceOf[js.Any])
    
    inline def `setMax-charsUndefined`: Self = StObject.set(x, "max-chars", js.undefined)
    
    inline def `setMax-width`(value: js.Any): Self = StObject.set(x, "max-width", value.asInstanceOf[js.Any])
    
    inline def `setMax-widthUndefined`: Self = StObject.set(x, "max-width", js.undefined)
    
    inline def `setOffset-x`(value: js.Any): Self = StObject.set(x, "offset-x", value.asInstanceOf[js.Any])
    
    inline def `setOffset-xUndefined`: Self = StObject.set(x, "offset-x", js.undefined)
    
    inline def `setOffset-y`(value: js.Any): Self = StObject.set(x, "offset-y", value.asInstanceOf[js.Any])
    
    inline def `setOffset-yUndefined`: Self = StObject.set(x, "offset-y", js.undefined)
    
    inline def setOrder(value: js.Any): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPadding(value: js.Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def `setPadding-bottom`(value: js.Any): Self = StObject.set(x, "padding-bottom", value.asInstanceOf[js.Any])
    
    inline def `setPadding-bottomUndefined`: Self = StObject.set(x, "padding-bottom", js.undefined)
    
    inline def `setPadding-left`(value: js.Any): Self = StObject.set(x, "padding-left", value.asInstanceOf[js.Any])
    
    inline def `setPadding-leftUndefined`: Self = StObject.set(x, "padding-left", js.undefined)
    
    inline def `setPadding-right`(value: js.Any): Self = StObject.set(x, "padding-right", value.asInstanceOf[js.Any])
    
    inline def `setPadding-rightUndefined`: Self = StObject.set(x, "padding-right", js.undefined)
    
    inline def `setPadding-top`(value: js.Any): Self = StObject.set(x, "padding-top", value.asInstanceOf[js.Any])
    
    inline def `setPadding-topUndefined`: Self = StObject.set(x, "padding-top", js.undefined)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def `setRtl Leftparenthesisright-to-leftRightparenthesis`(value: Boolean): Self = StObject.set(x, "rtl (right-to-left)", value.asInstanceOf[js.Any])
    
    inline def `setRtl Leftparenthesisright-to-leftRightparenthesisUndefined`: Self = StObject.set(x, "rtl (right-to-left)", js.undefined)
    
    inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def `setShadow-alpha`(value: Double): Self = StObject.set(x, "shadow-alpha", value.asInstanceOf[js.Any])
    
    inline def `setShadow-alphaUndefined`: Self = StObject.set(x, "shadow-alpha", js.undefined)
    
    inline def `setShadow-angle`(value: Double): Self = StObject.set(x, "shadow-angle", value.asInstanceOf[js.Any])
    
    inline def `setShadow-angleUndefined`: Self = StObject.set(x, "shadow-angle", js.undefined)
    
    inline def `setShadow-blur`(value: js.Any): Self = StObject.set(x, "shadow-blur", value.asInstanceOf[js.Any])
    
    inline def `setShadow-blurUndefined`: Self = StObject.set(x, "shadow-blur", js.undefined)
    
    inline def `setShadow-color`(value: String): Self = StObject.set(x, "shadow-color", value.asInstanceOf[js.Any])
    
    inline def `setShadow-colorUndefined`: Self = StObject.set(x, "shadow-color", js.undefined)
    
    inline def `setShadow-distance`(value: js.Any): Self = StObject.set(x, "shadow-distance", value.asInstanceOf[js.Any])
    
    inline def `setShadow-distanceUndefined`: Self = StObject.set(x, "shadow-distance", js.undefined)
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def `setText-align`(value: String): Self = StObject.set(x, "text-align", value.asInstanceOf[js.Any])
    
    inline def `setText-alignUndefined`: Self = StObject.set(x, "text-align", js.undefined)
    
    inline def `setText-alpha`(value: Double): Self = StObject.set(x, "text-alpha", value.asInstanceOf[js.Any])
    
    inline def `setText-alphaUndefined`: Self = StObject.set(x, "text-alpha", js.undefined)
    
    inline def `setText-decoration`(value: String): Self = StObject.set(x, "text-decoration", value.asInstanceOf[js.Any])
    
    inline def `setText-decorationUndefined`: Self = StObject.set(x, "text-decoration", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    
    inline def `setVertical-align`(value: String): Self = StObject.set(x, "vertical-align", value.asInstanceOf[js.Any])
    
    inline def `setVertical-alignUndefined`: Self = StObject.set(x, "vertical-align", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def `setWrap-text`(value: Boolean): Self = StObject.set(x, "wrap-text", value.asInstanceOf[js.Any])
    
    inline def `setWrap-textUndefined`: Self = StObject.set(x, "wrap-text", js.undefined)
  }
}
