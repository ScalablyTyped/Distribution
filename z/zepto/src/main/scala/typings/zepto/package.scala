package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zepto {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error
  import typings.std.Event
  import typings.std.XMLHttpRequest

  // Before sending the request, can be cancelled
  // event name: ajaxBeforeSend
  type ZeptoAjaxBeforeSendEvent = js.Function2[/* xhr */ XMLHttpRequest, /* options */ ZeptoAjaxSettings, Unit]
  // After request has completed, regardless of error or success
  // event name: ajaxComplete
  type ZeptoAjaxCompleteEvent = js.Function2[/* xhr */ XMLHttpRequest, /* options */ ZeptoAjaxSettings, Unit]
  // When there was an error
  // event name: ajaxError
  type ZeptoAjaxErrorEvent = js.Function3[/* xhr */ XMLHttpRequest, /* options */ ZeptoAjaxSettings, /* error */ Error, Unit]
  // Like ajaxBeforeSend, but not cancellable
  // event name: ajaxSend
  type ZeptoAjaxSendEvent = js.Function2[/* xhr */ XMLHttpRequest, /* options */ ZeptoAjaxSettings, Unit]
  // Fired if no other ajax requests are currently active
  // event name: ajaxStart
  type ZeptoAjaxStartEvent = js.Function0[Unit]
  // Fired if this was the last active Ajax request.
  // event name: ajaxStop
  type ZeptoAjaxStopEvent = js.Function0[Unit]
  // When the response is success
  // event name: ajaxSuccess
  type ZeptoAjaxSuccessEvent = js.Function3[/* xhr */ XMLHttpRequest, /* options */ ZeptoAjaxSettings, /* data */ js.Any, Unit]
  type ZeptoEventHandler = js.Function2[/* e */ Event, /* repeated */ js.Any, js.Any]
  type ZeptoEventHandlers = StringDictionary[ZeptoEventHandler]
}
