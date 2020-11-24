package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinegapsizeLinesegmentsize extends js.Object {
  
  /**
    * Sets the transparency of the scale-x minor-tick. See the red lines across the bottom between the ticks. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  
  /**
    * Sets the line color of the object. See the red lines across the bottom between the ticks. "none" | "transparent" | "#f00" | "#f00
    * #00f" | "red yellow" | "rgb(100, 15, 15)" | ...
    */
  var `line-color`: js.UndefOr[String] = js.native
  
  /**
    * Can be used to create custom dashed or dotted lines when used with line-segment-size. This will control the size of the gaps betwe
    * en each line segment. See the red lines across the bottom between the ticks. 4 | "6px" | ...
    */
  var `line-gap-size`: js.UndefOr[js.Any] = js.native
  
  /**
    * Can be used to create custom dashed or dotted lines when used with line-gap-size. This will control the size of the visible segmen
    * t of line. See the red lines across the bottom between the ticks. 4 | "6px" | ...
    */
  var `line-segment-size`: js.UndefOr[js.Any] = js.native
  
  /**
    * Sets the style applied to lines and borders of the object. See the red lines across the bottom between the ticks. "solid" | "dotte
    * d" | "dashed" | "dashdot"
    */
  var `line-style`: js.UndefOr[String] = js.native
  
  /**
    * Sets the line width of the object. See the red lines across the bottom between the ticks. 4 | "6px" | ...
    */
  var `line-width`: js.UndefOr[js.Any] = js.native
  
  /**
    * Determines the placement of minor tick marks along an axis line. inner | cross | outer
    */
  var placement: js.UndefOr[String] = js.native
  
  /**
    * Sets the visibility of the object. See the red lines across the bottom between the ticks. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object LinegapsizeLinesegmentsize {
  
  @scala.inline
  def apply(): LinegapsizeLinesegmentsize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinegapsizeLinesegmentsize]
  }
  
  @scala.inline
  implicit class LinegapsizeLinesegmentsizeOps[Self <: LinegapsizeLinesegmentsize] (val x: Self) extends AnyVal {
    
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
    def `setLine-color`(value: String): Self = this.set("line-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLine-color`: Self = this.set("line-color", js.undefined)
    
    @scala.inline
    def `setLine-gap-size`(value: js.Any): Self = this.set("line-gap-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLine-gap-size`: Self = this.set("line-gap-size", js.undefined)
    
    @scala.inline
    def `setLine-segment-size`(value: js.Any): Self = this.set("line-segment-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLine-segment-size`: Self = this.set("line-segment-size", js.undefined)
    
    @scala.inline
    def `setLine-style`(value: String): Self = this.set("line-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLine-style`: Self = this.set("line-style", js.undefined)
    
    @scala.inline
    def `setLine-width`(value: js.Any): Self = this.set("line-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLine-width`: Self = this.set("line-width", js.undefined)
    
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
