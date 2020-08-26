package typings.zipkinTransportHttp.anon

import org.scalablytyped.runtime.StringDictionary
import typings.node.urlMod.URL_
import typings.zipkin.mod.JsonEncoder_
import typings.zipkinTransportHttp.mod.ErrorLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Agent extends js.Object {
  var agent: js.UndefOr[
    typings.zipkinTransportHttp.mod.Agent | (js.Function1[/* url */ URL_, typings.zipkinTransportHttp.mod.Agent])
  ] = js.native
  var endpoint: String = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var httpInterval: js.UndefOr[Double] = js.native
  var jsonEncoder: js.UndefOr[JsonEncoder_] = js.native
  var log: js.UndefOr[ErrorLogger] = js.native
  var maxPayloadSize: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object Agent {
  @scala.inline
  def apply(endpoint: String): Agent = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Agent]
  }
  @scala.inline
  implicit class AgentOps[Self <: Agent] (val x: Self) extends AnyVal {
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
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgentFunction1(value: /* url */ URL_ => typings.zipkinTransportHttp.mod.Agent): Self = this.set("agent", js.Any.fromFunction1(value))
    @scala.inline
    def setAgent(
      value: typings.zipkinTransportHttp.mod.Agent | (js.Function1[/* url */ URL_, typings.zipkinTransportHttp.mod.Agent])
    ): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHttpInterval(value: Double): Self = this.set("httpInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpInterval: Self = this.set("httpInterval", js.undefined)
    @scala.inline
    def setJsonEncoder(value: JsonEncoder_): Self = this.set("jsonEncoder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonEncoder: Self = this.set("jsonEncoder", js.undefined)
    @scala.inline
    def setLog(value: ErrorLogger): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setMaxPayloadSize(value: Double): Self = this.set("maxPayloadSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPayloadSize: Self = this.set("maxPayloadSize", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

