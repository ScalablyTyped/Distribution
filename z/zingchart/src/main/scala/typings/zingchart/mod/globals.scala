package typings.zingchart.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait globals extends js.Object {
  
  /**
    * Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 be
    * ing completely opaque. Note that values require a leading zero before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  
  /**
    * Sets the border color of the object, applicable to closed shapes. "none" | "transparent" | "#1A237E" | "purple" | ...
    */
  var `border-color`: js.UndefOr[String] = js.native
  
  /**
    * Sets the border radius of the object, applicable to closed shapes. "3px" | "7px" | ...
    */
  var `border-radius`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the border width of the object, applicable to closed shapes. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the font color of the object. "none" | "transparent" | "#1A237E" | "purple" | ...
    */
  var `font-color`: js.UndefOr[String] = js.native
  
  /**
    * Sets the font family of the object. "Arial" | "Tahoma,Verdana" | ...
    */
  var `font-family`: js.UndefOr[String] = js.native
  
  /**
    * Sets the font size of the object. 12 | "20px" | ...
    */
  var `font-size`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the font weight of the object. "normal" | "bold"
    */
  var `font-weight`: js.UndefOr[String] = js.native
  
  /**
    * Sets the line color of the object, applicable to non-closed shapes. "none" | "transparent" | "#1A237E" | "purple" | ...
    */
  var `line-color`: js.UndefOr[String] = js.native
  
  /**
    * Sets the line style of the object, applicable to non-closed shapes. "solid" | "dashed" | "dotted" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.native
  
  /**
    * Sets the line width of the object, applicable to non-closed shapes. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[Double] = js.native
}
object globals {
  
  @scala.inline
  def apply(): globals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[globals]
  }
  
  @scala.inline
  implicit class globalsOps[Self <: globals] (val x: Self) extends AnyVal {
    
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
    def `setBorder-color`(value: String): Self = this.set("border-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBorder-color`: Self = this.set("border-color", js.undefined)
    
    @scala.inline
    def `setBorder-radius`(value: Double): Self = this.set("border-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBorder-radius`: Self = this.set("border-radius", js.undefined)
    
    @scala.inline
    def `setBorder-width`(value: Double): Self = this.set("border-width", value.asInstanceOf[js.Any])
    
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
    def `setFont-size`(value: Double): Self = this.set("font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-size`: Self = this.set("font-size", js.undefined)
    
    @scala.inline
    def `setFont-weight`(value: String): Self = this.set("font-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-weight`: Self = this.set("font-weight", js.undefined)
    
    @scala.inline
    def `setLine-color`(value: String): Self = this.set("line-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLine-color`: Self = this.set("line-color", js.undefined)
    
    @scala.inline
    def `setLine-style`(value: String): Self = this.set("line-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLine-style`: Self = this.set("line-style", js.undefined)
    
    @scala.inline
    def `setLine-width`(value: Double): Self = this.set("line-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLine-width`: Self = this.set("line-width", js.undefined)
  }
}
