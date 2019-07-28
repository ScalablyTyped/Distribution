package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseObject extends js.Object {
  var offset: js.UndefOr[Double] = js.undefined
  var response: js.UndefOr[String] = js.undefined
  var responseHeaders: js.UndefOr[js.Object] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object ResponseObject {
  @scala.inline
  def apply(
    offset: Int | Double = null,
    response: String = null,
    responseHeaders: js.Object = null,
    status: Int | Double = null,
    total: Int | Double = null
  ): ResponseObject = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
}

