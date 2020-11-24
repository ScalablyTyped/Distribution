package typings.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxOptions extends RectOptions {
  
  /** @default true */
  val bottomFace: js.UndefOr[Boolean | String] = js.native
  
  /** @default 1 */
  val depth: js.UndefOr[Double] = js.native
  
  /** @default true */
  val frontFace: js.UndefOr[Boolean | String] = js.native
  
  /** @default true */
  val leftFace: js.UndefOr[Boolean | String] = js.native
  
  /** @default true */
  val rearFace: js.UndefOr[Boolean | String] = js.native
  
  /** @default true */
  val rightFace: js.UndefOr[Boolean | String] = js.native
  
  /** @default true */
  val topFace: js.UndefOr[Boolean | String] = js.native
}
object BoxOptions {
  
  @scala.inline
  def apply(): BoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxOptions]
  }
  
  @scala.inline
  implicit class BoxOptionsOps[Self <: BoxOptions] (val x: Self) extends AnyVal {
    
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
    def setBottomFace(value: Boolean | String): Self = this.set("bottomFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomFace: Self = this.set("bottomFace", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setFrontFace(value: Boolean | String): Self = this.set("frontFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrontFace: Self = this.set("frontFace", js.undefined)
    
    @scala.inline
    def setLeftFace(value: Boolean | String): Self = this.set("leftFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftFace: Self = this.set("leftFace", js.undefined)
    
    @scala.inline
    def setRearFace(value: Boolean | String): Self = this.set("rearFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRearFace: Self = this.set("rearFace", js.undefined)
    
    @scala.inline
    def setRightFace(value: Boolean | String): Self = this.set("rightFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightFace: Self = this.set("rightFace", js.undefined)
    
    @scala.inline
    def setTopFace(value: Boolean | String): Self = this.set("topFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopFace: Self = this.set("topFace", js.undefined)
  }
}
