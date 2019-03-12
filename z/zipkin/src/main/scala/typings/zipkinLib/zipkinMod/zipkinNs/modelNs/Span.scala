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
  val tags: org.scalablytyped.runtime.StringDictionary[java.lang.String]
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

object Span {
  @scala.inline
  def apply(
    addAnnotation: (scala.Double, java.lang.String) => scala.Unit,
    annotations: js.Array[Annotation],
    debug: scala.Boolean,
    id: java.lang.String,
    putTag: (java.lang.String, java.lang.String) => scala.Unit,
    setDebug: scala.Boolean => scala.Unit,
    setDuration: scala.Double => scala.Unit,
    setKind: java.lang.String => scala.Unit,
    setLocalEndpoint: Endpoint => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setRemoteEndpoint: Endpoint => scala.Unit,
    setShared: scala.Boolean => scala.Unit,
    setTimestamp: scala.Double => scala.Unit,
    shared: scala.Boolean,
    tags: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    traceId: java.lang.String,
    duration: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    localEndpoint: Endpoint = null,
    name: java.lang.String = null,
    parentId: java.lang.String = null,
    remoteEndpoint: Endpoint = null,
    timestamp: scala.Int | scala.Double = null
  ): Span = {
    val __obj = js.Dynamic.literal(addAnnotation = js.Any.fromFunction2(addAnnotation), annotations = annotations, debug = debug, id = id, putTag = js.Any.fromFunction2(putTag), setDebug = js.Any.fromFunction1(setDebug), setDuration = js.Any.fromFunction1(setDuration), setKind = js.Any.fromFunction1(setKind), setLocalEndpoint = js.Any.fromFunction1(setLocalEndpoint), setName = js.Any.fromFunction1(setName), setRemoteEndpoint = js.Any.fromFunction1(setRemoteEndpoint), setShared = js.Any.fromFunction1(setShared), setTimestamp = js.Any.fromFunction1(setTimestamp), shared = shared, tags = tags, traceId = traceId)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (localEndpoint != null) __obj.updateDynamic("localEndpoint")(localEndpoint)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (remoteEndpoint != null) __obj.updateDynamic("remoteEndpoint")(remoteEndpoint)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Span]
  }
}

