package typings
package zipkinLib.zipkinMod.zipkinNs.modelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Span extends js.Object {
  val annotations: js.Array[Annotation]
  val debug: scala.Boolean
  val duration: js.UndefOr[scala.Double] = js.undefined
  val id: java.lang.String
  val kind: js.UndefOr[java.lang.String] = js.undefined
  val localEndpoint: js.UndefOr[Endpoint] = js.undefined
  val name: js.UndefOr[java.lang.String] = js.undefined
  val parentId: js.UndefOr[java.lang.String] = js.undefined
  val remoteEndpoint: js.UndefOr[Endpoint] = js.undefined
  val shared: scala.Boolean
  val tags: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  val timestamp: js.UndefOr[scala.Double] = js.undefined
  val traceId: java.lang.String
  def addAnnotation(timestamp: scala.Double, value: java.lang.String): scala.Unit
  def putTag(key: java.lang.String, value: java.lang.String): scala.Unit
  def setDebug(debug: scala.Boolean): scala.Unit
  def setDuration(duration: scala.Double): scala.Unit
  def setKind(kind: java.lang.String): scala.Unit
  def setLocalEndpoint(endpoint: Endpoint): scala.Unit
  def setName(name: java.lang.String): scala.Unit
  def setRemoteEndpoint(endpoint: Endpoint): scala.Unit
  def setShared(shared: scala.Boolean): scala.Unit
  def setTimestamp(timestamp: scala.Double): scala.Unit
}

