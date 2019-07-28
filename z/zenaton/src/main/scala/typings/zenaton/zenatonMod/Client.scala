package typings.zenaton.zenatonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zenaton", "Client")
@js.native
class Client protected () extends js.Object {
  def this(args: js.Any*) = this()
  def findWorkflow(args: js.Any*): js.Any = js.native
  def getAppEnv(args: js.Any*): js.Any = js.native
  def getBodyForTask(args: js.Any*): js.Any = js.native
  def getBodyForWorkflow(args: js.Any*): js.Any = js.native
  def getWebsiteUrl(args: js.Any*): js.Any = js.native
  def getWorkerUrl(args: js.Any*): js.Any = js.native
  def getWorkerUrlNew(args: js.Any*): js.Any = js.native
  def killWorkflow(args: js.Any*): js.Any = js.native
  def mustBeScheduled(args: js.Any*): js.Any = js.native
  def pauseWorkflow(args: js.Any*): js.Any = js.native
  def resumeWorkflow(args: js.Any*): js.Any = js.native
  def sendEvent(args: js.Any*): js.Any = js.native
  def sendEventByInstanceId(args: js.Any*): js.Any = js.native
  def startInstantTask(args: js.Any*): js.Any = js.native
  def startInstantWorkflow(args: js.Any*): js.Any = js.native
  def startScheduledTask(args: js.Any*): js.Any = js.native
  def startScheduledWorkflow(args: js.Any*): js.Any = js.native
  def startTask(args: js.Any*): js.Any = js.native
  def startWorkflow(args: js.Any*): js.Any = js.native
  def updateInstance(args: js.Any*): js.Any = js.native
}

/* static members */
@JSImport("zenaton", "Client")
@js.native
object Client extends js.Object {
  def init(args: js.Any*): js.Any = js.native
}

