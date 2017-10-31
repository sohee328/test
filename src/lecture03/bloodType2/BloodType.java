package lecture03.bloodType2;

public enum BloodType {
	A, B, O, AB;
	public boolean canGiveTo(BloodType recipient) {
		if (this == recipient)
			return true;
		if (this == O)
			return true;
		if (recipient == AB)
			return true;
		return false;
	}

}
