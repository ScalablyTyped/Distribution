package typings.zeromq.zeromqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zeromq", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ZMQ_AFFINITY: Double = js.native
  val ZMQ_BACKLOG: Double = js.native
  val ZMQ_CONNECT_TIMEOUT: Double = js.native
  val ZMQ_CURVE_PUBLICKEY: Double = js.native
  val ZMQ_CURVE_SECRETKEY: Double = js.native
  val ZMQ_CURVE_SERVER: Double = js.native
  val ZMQ_CURVE_SERVERKEY: Double = js.native
  val ZMQ_DELAY_ATTACH_ON_CONNECT: Double = js.native
  val ZMQ_EVENTS: Double = js.native
  val ZMQ_FD: Double = js.native
  val ZMQ_HEARTBEAT_IVL: Double = js.native
  val ZMQ_HEARTBEAT_TIMEOUT: Double = js.native
  val ZMQ_HEARTBEAT_TTL: Double = js.native
  val ZMQ_HWM: Double = js.native
  val ZMQ_IDENTITY: Double = js.native
  val ZMQ_IO_THREADS: Double = js.native
  val ZMQ_IPV4ONLY: Double = js.native
  val ZMQ_IPV6: Double = js.native
  val ZMQ_LAST_ENDPOINT: Double = js.native
  val ZMQ_LINGER: Double = js.native
  val ZMQ_MAXMSGSIZE: Double = js.native
  val ZMQ_MAX_SOCKETS: Double = js.native
  val ZMQ_MCAST_LOOP: Double = js.native
  val ZMQ_MECHANISM: Double = js.native
  val ZMQ_MULTICAST_HOPS: Double = js.native
  val ZMQ_PLAIN_PASSWORD: Double = js.native
  val ZMQ_PLAIN_SERVER: Double = js.native
  val ZMQ_PLAIN_USERNAME: Double = js.native
  val ZMQ_RATE: Double = js.native
  val ZMQ_RCVBUF: Double = js.native
  val ZMQ_RCVHWM: Double = js.native
  val ZMQ_RCVMORE: Double = js.native
  val ZMQ_RCVTIMEO: Double = js.native
  val ZMQ_RECONNECT_IVL: Double = js.native
  val ZMQ_RECONNECT_IVL_MAX: Double = js.native
  val ZMQ_RECOVERY_IVL: Double = js.native
  val ZMQ_RECOVERY_IVL_MSEC: Double = js.native
  val ZMQ_ROUTER_HANDOVER: Double = js.native
  val ZMQ_ROUTER_MANDATORY: Double = js.native
  val ZMQ_ROUTER_RAW: Double = js.native
  val ZMQ_SNDBUF: Double = js.native
  val ZMQ_SNDHWM: Double = js.native
  val ZMQ_SNDTIMEO: Double = js.native
  val ZMQ_SUBSCRIBE: Double = js.native
  val ZMQ_SWAP: Double = js.native
  val ZMQ_TCP_ACCEPT_FILTER: Double = js.native
  val ZMQ_TCP_KEEPALIVE: Double = js.native
  val ZMQ_TCP_KEEPALIVE_CNT: Double = js.native
  val ZMQ_TCP_KEEPALIVE_IDLE: Double = js.native
  val ZMQ_TCP_KEEPALIVE_INTVL: Double = js.native
  val ZMQ_TYPE: Double = js.native
  val ZMQ_UNSUBSCRIBE: Double = js.native
  val ZMQ_XPUB_VERBOSE: Double = js.native
  val ZMQ_ZAP_DOMAIN: Double = js.native
  var options: SocketOptions = js.native
  var types: SocketTypes = js.native
  var version: String = js.native
  def createSocket(`type`: String): Socket = js.native
  def createSocket(`type`: String, options: js.Any): Socket = js.native
  def curveKeypair(): CurveKeyPair = js.native
  def proxy(frontend: Socket, backend: Socket): Unit = js.native
  def proxy(frontend: Socket, backend: Socket, capture: Socket): Unit = js.native
  def socket(`type`: String): Socket = js.native
  def socket(`type`: String, options: js.Any): Socket = js.native
  def socket(`type`: Double): Socket = js.native
  def socket(`type`: Double, options: js.Any): Socket = js.native
}

