import nonogramRow.nonogramRows
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class nonogramRowSpec extends AnyFlatSpec{

  behavior of "nonogramRow"

  it should "return an array of positive integers that represent the lengths of the sets of consecutive 1's"
  nonogramRows(Array(1, 1, 1, 1, 1)) shouldBe Array(5)
  nonogramRows(Array(0,1,1,1,1,1,0,1,1,1,1)) shouldBe Array(5,4)
  nonogramRows(Array(1,1,0,1,0,0,1,1,1,0,0)) shouldBe Array(2,1,3)
}

