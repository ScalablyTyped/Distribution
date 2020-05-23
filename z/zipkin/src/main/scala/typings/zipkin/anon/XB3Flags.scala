package typings.zipkin.anon

import typings.zipkin.zipkinStrings.`0`
import typings.zipkin.zipkinStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XB3Flags extends js.Object {
  var `X-B3-Flags`: js.UndefOr[`1` | `0`] = js.undefined
  var `X-B3-ParentSpanId`: js.UndefOr[String] = js.undefined
  var `X-B3-Sampled`: js.UndefOr[`1` | `0`] = js.undefined
  var `X-B3-SpanId`: String
  var `X-B3-TraceId`: String
}

object XB3Flags {
  @scala.inline
  def apply(
    `X-B3-SpanId`: String,
    `X-B3-TraceId`: String,
    `X-B3-Flags`: `1` | `0` = null,
    `X-B3-ParentSpanId`: String = null,
    `X-B3-Sampled`: `1` | `0` = null
  ): XB3Flags = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("X-B3-SpanId")(`X-B3-SpanId`.asInstanceOf[js.Any])
    __obj.updateDynamic("X-B3-TraceId")(`X-B3-TraceId`.asInstanceOf[js.Any])
    if (`X-B3-Flags` != null) __obj.updateDynamic("X-B3-Flags")(`X-B3-Flags`.asInstanceOf[js.Any])
    if (`X-B3-ParentSpanId` != null) __obj.updateDynamic("X-B3-ParentSpanId")(`X-B3-ParentSpanId`.asInstanceOf[js.Any])
    if (`X-B3-Sampled` != null) __obj.updateDynamic("X-B3-Sampled")(`X-B3-Sampled`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XB3Flags]
  }
}

