package typings.zipkinTransportHttp.mod

import typings.zipkin.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin-transport-http", "HttpLogger")
@js.native
class HttpLogger protected () extends Logger {
  /**
    * @constructor
    * @param {Object} options
    * @param {string} options.endpoint HTTP endpoint which spans will be sent
    * @param {number} options.httpInterval How often to sync spans.
    * @param {JsonEncoder} options.jsonEncoder JSON encoder to use when sending spans.
    * @param {number} options.timeout Timeout for HTTP Post when sending spans.
    * @param {number} options.maxPayloadSize Max payload size for zipkin span.
    * @param {Object<string, string>} options.headers Any additional HTTP headers to be sent with span.
    * @param {Agent|Function} options.agent HTTP(S) agent to use for any networking related options.
    * @param {ErrorLogger} options.log Internal error logger used within the transport.
    */
  def this(options: typings.zipkinTransportHttp.anon.Agent) = this()
}

