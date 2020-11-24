package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Maxchars extends js.Object {
  
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  
  /**
    * Sets the background color of the object. A single color will create a solid background, while two colors will create a gradient. "
    * none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  
  /**
    * Sets the width of the object's border. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's font color. Similar to color. "none" | "transparent" | "#f00" | "#f00 #00f" | "red yellow" | "rgb(100, 15, 15)"
    * | ...
    */
  var `font-color`: js.UndefOr[String] = js.native
  
  /**
    * Sets the object's font family. "Arial" | "Tahoma,Verdana" | ...
    */
  var `font-family`: js.UndefOr[String] = js.native
  
  /**
    * Sets the object's font size. 4 | "6px" | ...
    */
  var `font-size`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the object's font style. Similar to italic. "none" | "italic" | "oblique"
    */
  var `font-style`: js.UndefOr[String] = js.native
  
  /**
    * Sets the object's font weight. Similar to bold. "normal" | "bold"
    */
  var `font-weight`: js.UndefOr[String] = js.native
  
  /**
    * Sets the object's height. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the maximum numbers of characters displayed in the object. The value determines how many characters will be displayed before
    * the text is cut and appended with "..." 5 | 10 | ...
    */
  var `max-chars`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the maximum width of the text box. If text is longer than the max-width value, it will overlap the box or will wrap if wrap-t
    * ext is set to true. 10 | "20px" | 0.3 | "30%" | ...
    */
  var `max-width`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets an X offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets a Y offset to apply when positioning the object/shape. 4 | "6px" | ...
    */
  var `offset-y`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the padding around the object's text. Up to four values can be used to set the padding around the text, with the first value
    * being the top padding, the second value being the right padding, the third value being the bottom padding, and the fourth value be
    * ing the left padding. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var padding: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the bottom padding for the object's text. 4 | "6px" | ...
    */
  var `padding-bottom`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the left padding for the object's text. 4 | "6px" | ...
    */
  var `padding-left`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the right padding for the object's text. 4 | "6px" | ...
    */
  var `padding-right`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the top padding for the object's text. 4 | "6px" | ...
    */
  var `padding-top`: js.UndefOr[js.Any] = js.native
  
  /**
    * Renders text right-to-left. Default value is false. true | false | 1 | 0
    */
  @JSName("rtl (right-to-left)")
  var `rtl Leftparenthesisright-to-leftRightparenthesis`: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the text content of the object. "Some Text" | ...
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * Sets the horizontal alignment for the object's text. Horizontal alignment can be left, center, or right. "left" | "center" | "righ
    * t"
    */
  var `text-align`: js.UndefOr[String] = js.native
  
  /**
    * Sets the transparency of the object's text. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 bei
    * ng completely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var `text-alpha`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the text's decoration to use underlined characters. Similar to underline. May not display properly in Mozilla Firefox when ch
    * arts are rendered using SVG. "none" | "underline"
    */
  var `text-decoration`: js.UndefOr[String] = js.native
  
  /**
    * Sets whether the context-menu button is visible or not. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the width of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets whether the text will wrap, depending on the width of the object. true | false | 1 | 0
    */
  var `wrap-text`: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the X position of the object. The context-menu gear object must be positioned separately. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the Y position of the object. The context-menu gear object must be positioned separately. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[js.Any] = js.native
}
object Maxchars {
  
  @scala.inline
  def apply(): Maxchars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Maxchars]
  }
  
  @scala.inline
  implicit class MaxcharsOps[Self <: Maxchars] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def `setBackground-color`(value: String): Self = this.set("background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-color`: Self = this.set("background-color", js.undefined)
    
    @scala.inline
    def `setBorder-width`(value: js.Any): Self = this.set("border-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBorder-width`: Self = this.set("border-width", js.undefined)
    
    @scala.inline
    def `setFont-color`(value: String): Self = this.set("font-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-color`: Self = this.set("font-color", js.undefined)
    
    @scala.inline
    def `setFont-family`(value: String): Self = this.set("font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-family`: Self = this.set("font-family", js.undefined)
    
    @scala.inline
    def `setFont-size`(value: js.Any): Self = this.set("font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-size`: Self = this.set("font-size", js.undefined)
    
    @scala.inline
    def `setFont-style`(value: String): Self = this.set("font-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-style`: Self = this.set("font-style", js.undefined)
    
    @scala.inline
    def `setFont-weight`(value: String): Self = this.set("font-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-weight`: Self = this.set("font-weight", js.undefined)
    
    @scala.inline
    def setHeight(value: js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def `setMax-chars`(value: Double): Self = this.set("max-chars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-chars`: Self = this.set("max-chars", js.undefined)
    
    @scala.inline
    def `setMax-width`(value: js.Any): Self = this.set("max-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-width`: Self = this.set("max-width", js.undefined)
    
    @scala.inline
    def `setOffset-x`(value: js.Any): Self = this.set("offset-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOffset-x`: Self = this.set("offset-x", js.undefined)
    
    @scala.inline
    def `setOffset-y`(value: js.Any): Self = this.set("offset-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOffset-y`: Self = this.set("offset-y", js.undefined)
    
    @scala.inline
    def setPadding(value: js.Any): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def `setPadding-bottom`(value: js.Any): Self = this.set("padding-bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePadding-bottom`: Self = this.set("padding-bottom", js.undefined)
    
    @scala.inline
    def `setPadding-left`(value: js.Any): Self = this.set("padding-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePadding-left`: Self = this.set("padding-left", js.undefined)
    
    @scala.inline
    def `setPadding-right`(value: js.Any): Self = this.set("padding-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePadding-right`: Self = this.set("padding-right", js.undefined)
    
    @scala.inline
    def `setPadding-top`(value: js.Any): Self = this.set("padding-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePadding-top`: Self = this.set("padding-top", js.undefined)
    
    @scala.inline
    def `setRtl Leftparenthesisright-to-leftRightparenthesis`(value: Boolean): Self = this.set("rtl (right-to-left)", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteRtl Leftparenthesisright-to-leftRightparenthesis`: Self = this.set("rtl (right-to-left)", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def `setText-align`(value: String): Self = this.set("text-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-align`: Self = this.set("text-align", js.undefined)
    
    @scala.inline
    def `setText-alpha`(value: Double): Self = this.set("text-alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-alpha`: Self = this.set("text-alpha", js.undefined)
    
    @scala.inline
    def `setText-decoration`(value: String): Self = this.set("text-decoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-decoration`: Self = this.set("text-decoration", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: js.Any): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def `setWrap-text`(value: Boolean): Self = this.set("wrap-text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteWrap-text`: Self = this.set("wrap-text", js.undefined)
    
    @scala.inline
    def setX(value: js.Any): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: js.Any): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
