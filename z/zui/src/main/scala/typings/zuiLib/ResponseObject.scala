package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseObject extends js.Object {
  var offset: js.UndefOr[scala.Double] = js.undefined
  var response: js.UndefOr[java.lang.String] = js.undefined
  var responseHeaders: js.UndefOr[js.Object] = js.undefined
  var status: js.UndefOr[scala.Double] = js.undefined
  var total: js.UndefOr[scala.Double] = js.undefined
}

object ResponseObject {
  @scala.inline
  def apply(
    offset: scala.Int | scala.Double = null,
    response: java.lang.String = null,
    responseHeaders: js.Object = null,
    status: scala.Int | scala.Double = null,
    total: scala.Int | scala.Double = null
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

