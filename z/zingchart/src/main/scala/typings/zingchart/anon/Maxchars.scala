package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maxchars extends StObject {
  
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
object Maxchars {
  
  @scala.inline
  def apply(): Maxchars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Maxchars]
  }
  
  @scala.inline
  implicit class MaxcharsMutableBuilder[Self <: Maxchars] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    @scala.inline
    def `setBorder-width`(value: js.Any): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    @scala.inline
    def `setFont-color`(value: String): Self = StObject.set(x, "font-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-colorUndefined`: Self = StObject.set(x, "font-color", js.undefined)
    
    @scala.inline
    def `setFont-family`(value: String): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    @scala.inline
    def `setFont-size`(value: js.Any): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
    
    @scala.inline
    def `setFont-style`(value: String): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
    
    @scala.inline
    def `setFont-weight`(value: String): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    @scala.inline
    def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def `setMax-chars`(value: Double): Self = StObject.set(x, "max-chars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-charsUndefined`: Self = StObject.set(x, "max-chars", js.undefined)
    
    @scala.inline
    def `setMax-width`(value: js.Any): Self = StObject.set(x, "max-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-widthUndefined`: Self = StObject.set(x, "max-width", js.undefined)
    
    @scala.inline
    def `setOffset-x`(value: js.Any): Self = StObject.set(x, "offset-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-xUndefined`: Self = StObject.set(x, "offset-x", js.undefined)
    
    @scala.inline
    def `setOffset-y`(value: js.Any): Self = StObject.set(x, "offset-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-yUndefined`: Self = StObject.set(x, "offset-y", js.undefined)
    
    @scala.inline
    def setPadding(value: js.Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-bottom`(value: js.Any): Self = StObject.set(x, "padding-bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-bottomUndefined`: Self = StObject.set(x, "padding-bottom", js.undefined)
    
    @scala.inline
    def `setPadding-left`(value: js.Any): Self = StObject.set(x, "padding-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-leftUndefined`: Self = StObject.set(x, "padding-left", js.undefined)
    
    @scala.inline
    def `setPadding-right`(value: js.Any): Self = StObject.set(x, "padding-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-rightUndefined`: Self = StObject.set(x, "padding-right", js.undefined)
    
    @scala.inline
    def `setPadding-top`(value: js.Any): Self = StObject.set(x, "padding-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-topUndefined`: Self = StObject.set(x, "padding-top", js.undefined)
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def `setRtl Leftparenthesisright-to-leftRightparenthesis`(value: Boolean): Self = StObject.set(x, "rtl (right-to-left)", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRtl Leftparenthesisright-to-leftRightparenthesisUndefined`: Self = StObject.set(x, "rtl (right-to-left)", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-align`(value: String): Self = StObject.set(x, "text-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-alignUndefined`: Self = StObject.set(x, "text-align", js.undefined)
    
    @scala.inline
    def `setText-alpha`(value: Double): Self = StObject.set(x, "text-alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-alphaUndefined`: Self = StObject.set(x, "text-alpha", js.undefined)
    
    @scala.inline
    def `setText-decoration`(value: String): Self = StObject.set(x, "text-decoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-decorationUndefined`: Self = StObject.set(x, "text-decoration", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def `setWrap-text`(value: Boolean): Self = StObject.set(x, "wrap-text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWrap-textUndefined`: Self = StObject.set(x, "wrap-text", js.undefined)
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: js.Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
