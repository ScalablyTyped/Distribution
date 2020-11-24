package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends js.Object {
  
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 being co
    * mpletely opaque. Note that the leading zero is required before the decimal. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., 'purple', 'blue'), hexadecimal notation (e.g., '#666
    * 699', '#33ccff'), or RGB notation (e.g., 'rgb(255,0,0)', 'rgb(0,0,255)'). 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100
    * , 15, 15)' | ...
    */
  var `background-color`: js.UndefOr[String] = js.native
  
  /**
    * Sets the border color of the object. Colors can be entered by name (e.g., 'purple', 'blue'), hexadecimal notation (e.g., '#666699'
    * , '#33ccff'), or RGB notation (e.g., 'rgb(255,0,0)', 'rgb(0,0,255)'). 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100, 15
    * , 15)' | ...
    */
  var `border-color`: js.UndefOr[String] = js.native
  
  /**
    * Sets the border radius of the object. 2 | 3 | '5px' | ...
    */
  var `border-radius`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the border width of the object. 1 | 3 | '6px' | ...
    */
  var `border-width`: js.UndefOr[Double] = js.native
  
  var label: js.UndefOr[Textalign] = js.native
  
  /**
    * Sets the line color of the object. Colors can be entered by name (e.g., 'purple', 'blue'), hexadecimal notation (e.g., '#666699',
    * '#33ccff'), or RGB notation (e.g., 'rgb(255,0,0)', 'rgb(0,0,255)'). 'none' | 'transparent' | 'purple' | '#33ccff' | 'rgb(100, 15,
    * 15)' | ...
    */
  var `line-color`: js.UndefOr[String] = js.native
  
  /**
    * Sets the line style of the object. 'solid' | 'dotted' | 'dashed' | 'dashdot'
    */
  var `line-style`: js.UndefOr[String] = js.native
  
  /**
    * Sets the line width of the object. 1 | 3 | '6px' | ...
    */
  var `line-width`: js.UndefOr[Double] = js.native
  
  /**
    * Sets an ending offset for the scale marker. 0.1 | ...
    */
  var `offset-end`: js.UndefOr[Double] = js.native
  
  /**
    * Sets a starting offset for the scale marker. 0.5 | ...
    */
  var `offset-start`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the range of the scale marker. Provide one value for line scale markers and two values (starting and ending) for area scale m
    * arkers. [60] | [20,40] | ...
    */
  var range: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the scale marker type: area or line. 'area' | 'line'
    */
  var `type`: js.UndefOr[String] = js.native
}
object Label {
  
  @scala.inline
  def apply(): Label = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: Textalign): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
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
    
    @scala.inline
    def `setOffset-end`(value: Double): Self = this.set("offset-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOffset-end`: Self = this.set("offset-end", js.undefined)
    
    @scala.inline
    def `setOffset-start`(value: Double): Self = this.set("offset-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOffset-start`: Self = this.set("offset-start", js.undefined)
    
    @scala.inline
    def setRange(value: js.Any): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
