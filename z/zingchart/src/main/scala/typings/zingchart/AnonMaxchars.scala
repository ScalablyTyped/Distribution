package typings.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxchars extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * Sets the background color of the object. A single color will create a solid background, while two colors will create a gradient. "
    * none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the width of the object's border. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's font color. Similar to color. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)"
    * | ...
    */
  var `font-color`: js.UndefOr[String] = js.undefined
  /**
    * Sets the object's font family. "Arial" | "Tahoma,Verdana" | ...
    */
  var `font-family`: js.UndefOr[String] = js.undefined
  /**
    * Sets the object's font size. 4 | "6px" | ...
    */
  var `font-size`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the object's font style. Similar to italic. "none" | "italic" | "oblique"
    */
  var `font-style`: js.UndefOr[String] = js.undefined
  /**
    * Sets the object's font weight. Similar to bold. "normal" | "bold"
    */
  var `font-weight`: js.UndefOr[String] = js.undefined
  /**
    * Sets the object's height. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the maximum numbers of characters displayed in the object. The value determines how many characters will be displayed before
    * the text is cut and appended with "..." 5 | 10 | ...
    */
  var `max-chars`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the maximum width of the text box. If text is longer than the max-width value, it will overlap the box or will wrap if wrap-t
    * ext is set to true. 10 | "20px" | 0.3 | "30%" | ...
    */
  var `max-width`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets an X offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets a Y offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the padding around the object's text. Up to four values can be used to set the padding around the text, with the first value
    * being the top padding, the second value being the right padding, the third value being the bottom padding, and the fourth value be
    * ing the left padding. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var padding: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the bottom padding for the object's text. 4 | "6px" | ...
    */
  var `padding-bottom`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the left padding for the object's text. 4 | "6px" | ...
    */
  var `padding-left`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the right padding for the object's text. 4 | "6px" | ...
    */
  var `padding-right`: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the top padding for the object's text. 4 | "6px" | ...
    */
  var `padding-top`: js.UndefOr[js.Any] = js.undefined
  /**
    * Renders text right-to-left. Default value is false. true | false | 1 | 0
    */
  @JSName("rtl (right-to-left)")
  var `rtl Leftparenthesisright-to-leftRightparenthesis`: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the text content of the object. "Some Text" | ...
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Sets the horizontal alignment for the object's text. Horizontal alignment can be left, center, or right. "left" | "center" | "righ
    * t"
    */
  var `text-align`: js.UndefOr[String] = js.undefined
  /**
    * Sets the transparency of the object's text. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 bei
    * ng completely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var `text-alpha`: js.UndefOr[Double] = js.undefined
  /**
    * Sets the text's decoration to use underlined characters. Similar to underline. May not display properly in Mozilla Firefox when ch
    * arts are rendered using SVG. "none" | "underline"
    */
  var `text-decoration`: js.UndefOr[String] = js.undefined
  /**
    * Sets whether the context-menu button is visible or not. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the width of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets whether the text will wrap, depending on the width of the object. true | false | 1 | 0
    */
  var `wrap-text`: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the X position of the object. The context-menu gear object must be positioned separately. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets the Y position of the object. The context-menu gear object must be positioned separately. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[js.Any] = js.undefined
}

object AnonMaxchars {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    `background-color`: String = null,
    `border-width`: js.Any = null,
    `font-color`: String = null,
    `font-family`: String = null,
    `font-size`: js.Any = null,
    `font-style`: String = null,
    `font-weight`: String = null,
    height: js.Any = null,
    `max-chars`: Int | Double = null,
    `max-width`: js.Any = null,
    `offset-x`: js.Any = null,
    `offset-y`: js.Any = null,
    padding: js.Any = null,
    `padding-bottom`: js.Any = null,
    `padding-left`: js.Any = null,
    `padding-right`: js.Any = null,
    `padding-top`: js.Any = null,
    `rtl Leftparenthesisright-to-leftRightparenthesis`: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    `text-align`: String = null,
    `text-alpha`: Int | Double = null,
    `text-decoration`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.Any = null,
    `wrap-text`: js.UndefOr[Boolean] = js.undefined,
    x: js.Any = null,
    y: js.Any = null
  ): AnonMaxchars = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (`font-color` != null) __obj.updateDynamic("font-color")(`font-color`.asInstanceOf[js.Any])
    if (`font-family` != null) __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    if (`font-size` != null) __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    if (`font-style` != null) __obj.updateDynamic("font-style")(`font-style`.asInstanceOf[js.Any])
    if (`font-weight` != null) __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (`max-chars` != null) __obj.updateDynamic("max-chars")(`max-chars`.asInstanceOf[js.Any])
    if (`max-width` != null) __obj.updateDynamic("max-width")(`max-width`.asInstanceOf[js.Any])
    if (`offset-x` != null) __obj.updateDynamic("offset-x")(`offset-x`.asInstanceOf[js.Any])
    if (`offset-y` != null) __obj.updateDynamic("offset-y")(`offset-y`.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (`padding-bottom` != null) __obj.updateDynamic("padding-bottom")(`padding-bottom`.asInstanceOf[js.Any])
    if (`padding-left` != null) __obj.updateDynamic("padding-left")(`padding-left`.asInstanceOf[js.Any])
    if (`padding-right` != null) __obj.updateDynamic("padding-right")(`padding-right`.asInstanceOf[js.Any])
    if (`padding-top` != null) __obj.updateDynamic("padding-top")(`padding-top`.asInstanceOf[js.Any])
    if (!js.isUndefined(`rtl Leftparenthesisright-to-leftRightparenthesis`)) __obj.updateDynamic("rtl (right-to-left)")(`rtl Leftparenthesisright-to-leftRightparenthesis`.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`text-align` != null) __obj.updateDynamic("text-align")(`text-align`.asInstanceOf[js.Any])
    if (`text-alpha` != null) __obj.updateDynamic("text-alpha")(`text-alpha`.asInstanceOf[js.Any])
    if (`text-decoration` != null) __obj.updateDynamic("text-decoration")(`text-decoration`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(`wrap-text`)) __obj.updateDynamic("wrap-text")(`wrap-text`.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxchars]
  }
}

