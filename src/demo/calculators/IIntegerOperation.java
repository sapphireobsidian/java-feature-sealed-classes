package demo.calculators;

import java.util.function.BiFunction;

public sealed interface IIntegerOperation {
	
	Integer evaluate(Integer operand1, Integer operand2);

	enum IntegerOperation implements IIntegerOperation {
		Addition((x, y) -> { return x + y; }), 
		Subtraction((x, y) -> { return x - y; });

		private BiFunction<Integer, Integer, Integer> processor;

		private IntegerOperation(BiFunction<Integer, Integer, Integer> processor) {
			this.processor = processor;
		}

		@Override
		public Integer evaluate(Integer operand1, Integer operand2) {
			return processor.apply(operand1, operand2);
		}
	}
	
}
