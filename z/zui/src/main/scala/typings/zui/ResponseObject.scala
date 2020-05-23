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
    offset: js.UndefOr[Double] = js.undefined,
    response: String = null,
    responseHeaders: js.Object = null,
    status: js.UndefOr[Double] = js.undefined,
    total: js.UndefOr[Double] = js.undefined
  ): ResponseObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
}

