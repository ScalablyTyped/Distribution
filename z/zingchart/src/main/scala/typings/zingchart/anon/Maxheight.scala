package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Maxheight extends js.Object {
  
  /**
    * Sets the maximum chart height in pixels. 600 | 400 | 300
    */
  var `max-height`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the maximum chart width in pixels. 1000 | 800 | 600
    */
  var `max-width`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the minimum chart height in pixels. 600 | 400 | 300
    */
  var `min-height`: js.UndefOr[Double] = js.native
  
  /**
    * Sets the minimum chart width in pixels. 1000 | 800 | 600
    */
  var `min-width`: js.UndefOr[Double] = js.native
  
  /**
    * Removes the object (legend, title) from the chart at that specified breakpoint. Use the attribute to save screen space at smaller
    * breakpoints. true | false
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object Maxheight {
  
  @scala.inline
  def apply(): Maxheight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Maxheight]
  }
  
  @scala.inline
  implicit class MaxheightOps[Self <: Maxheight] (val x: Self) extends AnyVal {
    
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
    def `setMax-height`(value: Double): Self = this.set("max-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-height`: Self = this.set("max-height", js.undefined)
    
    @scala.inline
    def `setMax-width`(value: Double): Self = this.set("max-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-width`: Self = this.set("max-width", js.undefined)
    
    @scala.inline
    def `setMin-height`(value: Double): Self = this.set("min-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMin-height`: Self = this.set("min-height", js.undefined)
    
    @scala.inline
    def `setMin-width`(value: Double): Self = this.set("min-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMin-width`: Self = this.set("min-width", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
