package eg.edu.cu.fcai.swe.fawry.refund;

public record RefundRequest(String transactionId, RefundStatus refundStatus) {
}
