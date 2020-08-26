package typings.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CylinderOptions extends ShapeOptions {
  /** @default 1 */
  val diameter: js.UndefOr[Double] = js.native
  val frontFace: js.UndefOr[Boolean | String] = js.native
  /** @default 1 */
  val length: js.UndefOr[Double] = js.native
}

object CylinderOptions {
  @scala.inline
  def apply(): CylinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CylinderOptions]
  }
  @scala.inline
  implicit class CylinderOptionsOps[Self <: CylinderOptions] (val x: Self) extends AnyVal {
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
    def setFrontFace(value: Boolean | String): Self = this.set("frontFace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrontFace: Self = this.set("frontFace", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
  }
  
}

