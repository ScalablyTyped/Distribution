package typings.zipkin.zipkinMod

import typings.zipkin.Anon_CtxImpl
import typings.zipkin.zipkinMod.option.IOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "Tracer")
@js.native
class Tracer protected () extends js.Object {
  def this(args: Anon_CtxImpl) = this()
  /** Returns the current trace ID or a sentinel value indicating its absence. */
  var id: TraceId = js.native
  /** Creates a child of the current trace ID or a new root span. */
  def createChildId(): TraceId = js.native
  def createChildId(parentId: TraceId): TraceId = js.native
  def createRootId(): TraceId = js.native
  def createRootId(isSampled: IOption[Boolean]): TraceId = js.native
  def createRootId(isSampled: IOption[Boolean], isDebug: Boolean): TraceId = js.native
  def letId[V](traceId: TraceId, callback: js.Function0[V]): V = js.native
  def local[V](name: String, callback: js.Function0[V]): V = js.native
  def recordAnnotation(annotation: IAnnotation): Unit = js.native
  def recordAnnotation(annotation: IAnnotation, timestamp: Double): Unit = js.native
  def recordBinary(key: String, value: String): Unit = js.native
  def recordBinary(key: String, value: Boolean): Unit = js.native
  def recordBinary(key: String, value: Double): Unit = js.native
  def recordClientAddr(inetAddress: InetAddress): Unit = js.native
  def recordLocalAddr(inetAddress: InetAddress): Unit = js.native
  def recordMessage(message: String): Unit = js.native
  def recordRpc(name: String): Unit = js.native
  def recordServerAddr(inetAddress: InetAddress): Unit = js.native
  def recordServiceName(serviceName: String): Unit = js.native
  def scoped[V](callback: js.Function0[V]): V = js.native
  def setId(traceId: TraceId): Unit = js.native
  def writeIdToConsole(message: js.Any): Unit = js.native
}

