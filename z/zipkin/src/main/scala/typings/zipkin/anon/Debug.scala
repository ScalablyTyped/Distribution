package typings.zipkin.anon

import typings.zipkin.mod.option.IOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Debug extends js.Object {
  var debug: js.UndefOr[Boolean] = js.native
  var parentId: js.UndefOr[IOption[String]] = js.native
  var sampled: js.UndefOr[IOption[Boolean]] = js.native
  var shared: js.UndefOr[Boolean] = js.native
  var spanId: js.UndefOr[String] = js.native
  var traceId: js.UndefOr[String] = js.native
}

object Debug {
  @scala.inline
  def apply(): Debug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Debug]
  }
  @scala.inline
  implicit class DebugOps[Self <: Debug] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setParentId(value: IOption[String]): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    @scala.inline
    def setSampled(value: IOption[Boolean]): Self = this.set("sampled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampled: Self = this.set("sampled", js.undefined)
    @scala.inline
    def setShared(value: Boolean): Self = this.set("shared", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    @scala.inline
    def setSpanId(value: String): Self = this.set("spanId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpanId: Self = this.set("spanId", js.undefined)
    @scala.inline
    def setTraceId(value: String): Self = this.set("traceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceId: Self = this.set("traceId", js.undefined)
  }
  
}

