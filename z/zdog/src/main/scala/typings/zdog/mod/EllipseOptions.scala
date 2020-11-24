package typings.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EllipseOptions extends ShapeOptions {
  
  /** @default 1 */
  val diameter: js.UndefOr[Double] = js.native
  
  val height: js.UndefOr[Double] = js.native
  
  /** @default 4 */
  val quarters: js.UndefOr[QuartersValue] = js.native
  
  val width: js.UndefOr[Double] = js.native
}
object EllipseOptions {
  
  @scala.inline
  def apply(): EllipseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EllipseOptions]
  }
  
  @scala.inline
  implicit class EllipseOptionsOps[Self <: EllipseOptions] (val x: Self) extends AnyVal {
    
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
    def setDiameter(value: Double): Self = this.set("diameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiameter: Self = this.set("diameter", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setQuarters(value: QuartersValue): Self = this.set("quarters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuarters: Self = this.set("quarters", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
