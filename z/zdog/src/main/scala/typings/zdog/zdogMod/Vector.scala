package typings.zdog.zdogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zdog", "Vector")
@js.native
class Vector () extends js.Object {
  def this(position: VectorOptions) = this()
  /** @see {@link VectorOptions#backface} */
  var x: Double = js.native
  /** @see {@link VectorOptions#backface} */
  var y: Double = js.native
  /** @see {@link VectorOptions#backface} */
  var z: Double = js.native
  /**
    * Adds {@link x}, {@link y}, {@link z} coordinate values.
    * @see {@link https://zzz.dog/api#vector-add Zdog API}
    */
  def add(): this.type = js.native
  def add(position: VectorOptions): this.type = js.native
  /**
    * Returns a new {@link Vector} with copied {@link x}, {@link y} and {@link z} coordinates.
    * Most Vector methods are mutable — they change the Vector’s coordinates.
    * Use .{@link copy}() to work with a vector while still preserving the original.
    * @see {@link https://zzz.dog/api#vector-copy Zdog API}
    */
  def copy(): Vector = js.native
  /**
    * Linear interporlate the vector towards `point`, given `alpha` a percent between the vector and `point`.
    * @see {@link https://zzz.dog/api#vector-lerp Zdog API}
    */
  def lerp(position: VectorOptions, alpha: Double): this.type = js.native
  /**
    * Returns the total length of the vector.
    * @see {@link https://zzz.dog/api#vector-magnitude Zdog API}
    */
  def magnitude(): Double = js.native
  /**
    * Multiplies {@link x}, {@link y}, {@link z} coordinate values.
    * @see {@link https://zzz.dog/api#vector-multiply Zdog API}
    */
  def multiply(): this.type = js.native
  def multiply(position: Double): this.type = js.native
  def multiply(position: VectorOptions): this.type = js.native
  /**
    * Rotates a position vector given a `rotation` vector Object.
    * @see {@link https://zzz.dog/api#vector-rotate Zdog API}
    */
  def rotate(): this.type = js.native
  def rotate(rotation: VectorOptions): this.type = js.native
  /**
    * Sets {@link x}, {@link y}, {@link z} coordinates.
    * @see {@link https://zzz.dog/api#vector-set Zdog API}
    */
  def set(): this.type = js.native
  def set(position: VectorOptions): this.type = js.native
  /**
    * Subtracts {@link x}, {@link y}, {@link z} coordinate values.
    * @see {@link https://zzz.dog/api#vector-subtract Zdog API}
    */
  def subtract(): this.type = js.native
  def subtract(position: VectorOptions): this.type = js.native
}

